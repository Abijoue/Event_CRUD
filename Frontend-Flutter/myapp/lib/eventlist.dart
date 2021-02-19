import 'package:flutter/material.dart';
import 'package:myapp/models/event.dart';
import 'detailwidget.dart';

class EventsList extends StatelessWidget {
  final List<Event> events;
  EventsList({Key key, this.events}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return ListView.builder(
        itemCount: events == null ? 0 : events.length,
        itemBuilder: (BuildContext context, int index) {
          return Card(
              child: InkWell(
            onTap: () {
              Navigator.push(
                context,
                MaterialPageRoute(
                    builder: (context) => DetailWidget(events[index])),
              );
            },
            child: ListTile(
              leading: Icon(Icons.access_alarm_rounded),
              title: Text(events[index].nom ?? 'default'),
              subtitle: Text(events[index].organisme ?? 'default'),
            ),
          ));
        });
  }
}
