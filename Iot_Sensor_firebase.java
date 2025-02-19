DatabaseReference ref = FirebaseDatabase.getInstance().getReference("health_data/heart_rate");
ref.addValueEventListener(new ValueEventListener() {
    public void onDataChange(DataSnapshot snapshot) {
        int heartRate = snapshot.getValue(Integer.class);
    }
    public void onCancelled(DatabaseError error) {}
});
