package com.example.javamaps.roomdb;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import com.example.javamaps.model.Place;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableHide;

import java.util.List;

@Dao
public interface PlaceDao {

    @Query("SELECT *FROM Place")
    Flowable<List<Place>> getAll();

    @Insert
    Completable insert(Place place);

    @Delete
    Completable delete(Place place);
}
