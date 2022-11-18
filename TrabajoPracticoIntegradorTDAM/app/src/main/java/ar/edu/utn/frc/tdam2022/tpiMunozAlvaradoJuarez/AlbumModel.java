package ar.edu.utn.frc.tdam2022.tpiMunozAlvaradoJuarez;

public class AlbumModel {

    public AlbumModel() {
    }

    public AlbumModel(String name) {
        this.name = name;
    }

    public AlbumModel(String name, String album_id, String primary_photo_id, String photo_count, String views, String date_upload) {
        this.name = name;
        this.album_id = album_id;
        this.primary_photo_id = primary_photo_id;
        this.photo_count = photo_count;
        this.views = views;
        this.date_upload = date_upload;
    }

    private String name;
    private String album_id;
    private String primary_photo_id;
    private String photo_count;
    private String views;
    //El date_upload que se recupera del servidor está expresado en segundos
    private String date_upload;

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlbum_id() {
        return album_id;
    }

    public void setAlbum_id(String album_id) {
        this.album_id = album_id;
    }

    public String getPrimary_photo_id() {
        return primary_photo_id;
    }

    public void setPrimary_photo_id(String primary_photo_id) {
        this.primary_photo_id = primary_photo_id;
    }

    public String getPhoto_count() {
        return photo_count;
    }

    public void setPhoto_count(String photo_count) {
        this.photo_count = photo_count;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public String getDate_upload() {
        return date_upload;
    }

    public void setDate_upload(String date_upload) {
        this.date_upload = date_upload;
    }


}
