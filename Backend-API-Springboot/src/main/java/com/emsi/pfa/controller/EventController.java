package com.emsi.pfa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.emsi.pfa.exception.ResourceNotFoundException;
import com.emsi.pfa.model.Event;
import com.emsi.pfa.repository.EventRepository;

@RestController
@RequestMapping("/api/")
public class EventController {

	@Autowired
	private EventRepository eventsrepository;
	
	//get Event
	@GetMapping("events")
	public List<Event> getAllEvents(){
		return this.eventsrepository.findAll();
		}
	
	//get Event by id
    @GetMapping("/events/{id}")
    public ResponseEntity<Event> getEventById(@PathVariable(value = "id") Long EventId)
        throws ResourceNotFoundException {
    	Event branche = eventsrepository.findById(EventId)
        .orElseThrow(() -> new ResourceNotFoundException("The Event not found for this id :: " + EventId));
        return ResponseEntity.ok().body(branche);
    }
	
	
	//save Event
    @PostMapping("/events")
    public Event createBranche( @RequestBody Event ev) {
        return eventsrepository.save(ev);
    }
    
	//update event
    @PutMapping("/events/{id}")
    public ResponseEntity<HttpStatus> updateEvent(@PathVariable(value = "id") Long EventId,
          @RequestBody Event EventDetails) throws ResourceNotFoundException {
    	Event foundedEv = eventsrepository.findById(EventId)
        .orElseThrow(() -> new ResourceNotFoundException("The Event not found for this id ::" + EventId));

        //Branche.setBranche(BrancheDetails.getBranche());
    	foundedEv.set_id(EventId);
    	foundedEv.setNom(EventDetails.getNom());
    	foundedEv.setOrganisme(EventDetails.getOrganisme());
    	foundedEv.setAdresse(EventDetails.getAdresse());

    	eventsrepository.save(foundedEv);
        return ResponseEntity.ok(HttpStatus.OK);
    }
    
	//delete event
    @DeleteMapping("/events/{id}")
    public ResponseEntity<HttpStatus> deletebranche(@PathVariable(value = "id") Long EventId)
         throws ResourceNotFoundException {
    	Event foundedEv = eventsrepository.findById(EventId)
       .orElseThrow(() -> new ResourceNotFoundException("The Event not found for this id ::" + EventId));

    	eventsrepository.delete(foundedEv);
        return ResponseEntity.ok(HttpStatus.OK);
    }
	
	
}
