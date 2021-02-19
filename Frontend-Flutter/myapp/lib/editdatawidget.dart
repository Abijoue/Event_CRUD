import 'package:flutter/material.dart';
import 'services/api_service.dart';
import 'models/event.dart';

class EditDataWidget extends StatefulWidget {
  EditDataWidget(this.event);

  final Event event;

  @override
  _EditDataWidgetState createState() => _EditDataWidgetState();
}

class _EditDataWidgetState extends State<EditDataWidget> {
  _EditDataWidgetState();

  final ApiService api = ApiService();
  final _addFormKey = GlobalKey<FormState>();
  int id = 0;
  final _nameController = TextEditingController();
  final _orgController = TextEditingController();
  final _addressController = TextEditingController();

  @override
  void initState() {
    id = widget.event.id;
    _nameController.text = widget.event.nom;
    _orgController.text = widget.event.organisme;
    _addressController.text = widget.event.adresse;
    super.initState();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Edit Event'),
      ),
      body: Form(
        key: _addFormKey,
        child: SingleChildScrollView(
          child: Container(
            padding: EdgeInsets.all(20.0),
            child: Card(
                child: Container(
                    padding: EdgeInsets.all(10.0),
                    width: 440,
                    child: Column(
                      children: <Widget>[
                        Container(
                          margin: EdgeInsets.fromLTRB(0, 0, 0, 10),
                          child: Column(
                            children: <Widget>[
                              Text('Name'),
                              TextFormField(
                                controller: _nameController,
                                decoration: const InputDecoration(
                                  hintText: 'Name',
                                ),
                                validator: (value) {
                                  if (value.isEmpty) {
                                    return 'Please enter the name of the event';
                                  }
                                  return null;
                                },
                                onChanged: (value) {},
                              ),
                            ],
                          ),
                        ),
                        Container(
                          margin: EdgeInsets.fromLTRB(0, 0, 0, 10),
                          child: Column(
                            children: <Widget>[
                              Text('organisation'),
                              TextFormField(
                                controller: _orgController,
                                decoration: const InputDecoration(
                                  hintText: 'organisation',
                                ),
                                keyboardType: TextInputType.number,
                                validator: (value) {
                                  if (value.isEmpty) {
                                    return 'Please enter you organisation';
                                  }
                                  return null;
                                },
                                onChanged: (value) {},
                              ),
                            ],
                          ),
                        ),
                        Container(
                          margin: EdgeInsets.fromLTRB(0, 0, 0, 10),
                          child: Column(
                            children: <Widget>[
                              Text('Address'),
                              TextFormField(
                                controller: _addressController,
                                decoration: const InputDecoration(
                                  hintText: 'Address',
                                ),
                                validator: (value) {
                                  if (value.isEmpty) {
                                    return 'Please enter address';
                                  }
                                  return null;
                                },
                                onChanged: (value) {},
                              ),
                            ],
                          ),
                        ),
                        Container(
                          margin: EdgeInsets.fromLTRB(0, 0, 0, 10),
                          child: Column(
                            children: <Widget>[
                              RaisedButton(
                                splashColor: Colors.red,
                                onPressed: () {
                                  if (_addFormKey.currentState.validate()) {
                                    _addFormKey.currentState.save();
                                    api.updateEvent(
                                        id,
                                        Event(
                                            nom: _nameController.text,
                                            organisme: _orgController.text,
                                            adresse: _addressController.text));
                                    Navigator.pop(context);
                                  }
                                },
                                child: Text('Save',
                                    style: TextStyle(color: Colors.white)),
                                color: Colors.blue,
                              )
                            ],
                          ),
                        ),
                      ],
                    ))),
          ),
        ),
      ),
    );
  }
}
