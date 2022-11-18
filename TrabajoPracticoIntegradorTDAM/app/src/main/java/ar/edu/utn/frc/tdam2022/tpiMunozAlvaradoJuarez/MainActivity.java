package ar.edu.utn.frc.tdam2022.tpiMunozAlvaradoJuarez;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private RecyclerView recyclerViewAlbum;
    private AlbumAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewAlbum = (RecyclerView) findViewById(R.id.recyclerViewAlbum);

        recyclerViewAlbum.setHasFixedSize(true);

        recyclerViewAlbum.setLayoutManager(new LinearLayoutManager(this));
        //reyclerViewUser.setLayoutManager(new GridLayoutManager(this, 3));

        DividerItemDecoration mDividerItemDecoration = new DividerItemDecoration(recyclerViewAlbum.getContext(),
                LinearLayout.VERTICAL);
        recyclerViewAlbum.addItemDecoration(mDividerItemDecoration);

        List<AlbumModel> albumModelList = getData();
        mAdapter = new AlbumAdapter(albumModelList);
        mAdapter.notifyDataSetChanged();
        recyclerViewAlbum.setAdapter(mAdapter);

        mAdapter.setItemClickListener(new AlbumAdapter.ItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                String name = albumModelList.get(position).getName();
                Toast.makeText(getApplicationContext(), "name: " + name, Toast.LENGTH_SHORT).show();
            }
        });

    }

    // acá debería tomar los datos de la API de flickr
    public List<AlbumModel> getData() {

        List<AlbumModel> userModels = new ArrayList<>();
        userModels.add(new AlbumModel("Gisela"));
        userModels.add(new AlbumModel("Fabian"));
        userModels.add(new AlbumModel("Susana"));
        userModels.add(new AlbumModel("Agustin"));
        userModels.add(new AlbumModel("Carlos"));
        userModels.add(new AlbumModel("Juana"));

        for(int i = 1; i < 7000; i++) {
            userModels.add(new AlbumModel("Name " + i));
        }

        return userModels;
    }

}
