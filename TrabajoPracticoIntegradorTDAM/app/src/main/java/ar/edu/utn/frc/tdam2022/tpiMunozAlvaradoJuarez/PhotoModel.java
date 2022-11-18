package ar.edu.utn.frc.tdam2022.tpiMunozAlvaradoJuarez;

import java.util.List;

public class PhotoModel {
    public PhotoModel(){

    }
    public PhotoModel(String name){
        this.name = name;
    }

    private String name;
    private String photo_id;
    private String date_upload;
    private String url;
    private List<CommentModel> comments;
    private String views;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
