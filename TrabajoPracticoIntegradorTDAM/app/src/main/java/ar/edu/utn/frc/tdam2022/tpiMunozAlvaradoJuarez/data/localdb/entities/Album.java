package ar.edu.utn.frc.tdam2022.tpiMunozAlvaradoJuarez.data.localdb.entities;

import androidx.room.Entity;

@Entity
public class Album {
    public String name;
    public String album_id;
    public String primary_photo_id;
    public String photo_count;
    public String views;
    //El date_upload que se recupera del servidor está expresado en segundos
    public String date_upload;
}
