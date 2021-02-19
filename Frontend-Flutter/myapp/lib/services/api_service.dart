import 'dart:convert';
import 'dart:convert' show utf8;
import 'package:http/http.dart';
import 'package:http/http.dart' as http;
import 'package:myapp/models/event.dart';

import 'dart:developer';

class ApiService {
  final String apiUrl = "http://10.0.2.2:8080/api/events";

  Future<List<Event>> getEvents() async {
    //Response res = await get(apiUrl);
    http.Response res =
        await http.get(apiUrl, headers: {'Content-Type': 'application/json'});

    if (res.statusCode == 200) {
      List<dynamic> body = jsonDecode(utf8.decode(res.bodyBytes));
      List<Event> events =
          body.map((dynamic item) => Event.fromJson(item)).toList();
      log('***********************: $events');
      return events;
    } else {
      throw "Failed to load events list";
    }
  }

  Future<Event> getEventById(String id) async {
    final response = await get('$apiUrl/$id');

    if (response.statusCode == 200) {
      return Event.fromJson(json.decode(response.body));
    } else {
      throw Exception('Failed to load the Event');
    }
  }

  Future<Event> createEvent(Event event) async {
    Map data = {
      'id': event.id.toString(),
      "organisme": event.organisme,
      "nom": event.nom,
      "adresse": event.adresse
    };

    final Response response = await post(
      apiUrl,
      headers: <String, String>{
        'Content-Type': 'application/json; charset=UTF-8',
      },
      body: jsonEncode(data),
    );
    if (response.statusCode == 200) {
      return Event.fromJson(json.decode(response.body));
    } else {
      throw Exception('Failed to post the Event');
    }
  }

  Future<Event> updateEvent(int id, Event event) async {
    Map data = {
      'id': event.id.toString(),
      "organisme": event.organisme,
      "nom": event.nom,
      "adresse": event.adresse
    };

    final Response response = await put(
      '$apiUrl/$id',
      headers: <String, String>{
        'Content-Type': 'application/json; charset=UTF-8',
      },
      body: jsonEncode(data),
    );
    if (response.statusCode == 200) {
      return Event.fromJson(json.decode(response.body));
    } else {
      throw Exception('Failed to update the Event');
    }
  }

  Future<void> deleteEvent(int id) async {
    Response res = await delete('$apiUrl/$id');

    if (res.statusCode == 200) {
      print("Event deleted");
    } else {
      throw "Failed to delete the Event.";
    }
  }
}
