class Event {
  int id;
  String organisme;
  String nom;
  String adresse;

  Event({this.id, this.organisme, this.nom, this.adresse});

  factory Event.fromJson(Map<String, dynamic> json) {
    return Event(
      id: json['_id'] as int,
      organisme: json['organisme'] as String,
      nom: json['nom'] as String,
      adresse: json['adresse'] as String,
    );
  }

  @override
  String toString() {
    return 'Event{id: $id, name: $nom, org: $organisme , adr : $adresse}';
  }
}
