package ar.edu.utn.frc.tdam2022.tpiMunozAlvaradoJuarez.data.localdb;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import ar.edu.utn.frc.tdam2022.tpiMunozAlvaradoJuarez.data.localdb.dao.CommentDao;
import ar.edu.utn.frc.tdam2022.tpiMunozAlvaradoJuarez.data.localdb.dao.PhotoDao;
import ar.edu.utn.frc.tdam2022.tpiMunozAlvaradoJuarez.data.localdb.dao.AlbumDao;
import ar.edu.utn.frc.tdam2022.tpiMunozAlvaradoJuarez.data.localdb.entities.Album;
import ar.edu.utn.frc.tdam2022.tpiMunozAlvaradoJuarez.data.localdb.entities.Comment;
import ar.edu.utn.frc.tdam2022.tpiMunozAlvaradoJuarez.data.localdb.entities.Photo;

@Database(entities = {Album.class, Comment.class, Photo.class}, version = 1)
public abstract class database extends RoomDatabase {

    public abstract AlbumDao albumDao();

    public abstract PhotoDao photoDao();

    public abstract CommentDao commentDao();
}
