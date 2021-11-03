package com.example.pinterest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import SignInSignUp.GridviewAdapter;
import SignInSignUp.HinhAnh;

public class LayoutTrangchuActivity extends AppCompatActivity  {
    GridView gridView;
    String[] imageName={"Hoa","Nghệ thuật","Móng tay","Giáo dục","Anime","Nhiếp ảnh","Động vật","Sức khỏe","Thiết kế","Mặt trăng","Trang sức","Xe","Bầu trời xanh","Koi","Hình xăm"};
    int[] images={R.drawable.hoa,R.drawable.nghethuat,R.drawable.mongtay,R.drawable.giaoduc,R.drawable.anime
            ,R.drawable.nhiepanh,R.drawable.dog4,R.drawable.suckhoe,R.drawable.thietke,R.drawable.mattrang,R.drawable.trangsuc
            ,R.drawable.xedep,R.drawable.bautroixanh,R.drawable.koi,R.drawable.hinhxam};
    int[] imgButton={R.drawable.ic_moreoption,R.drawable.ic_moreoption,R.drawable.ic_moreoption,R.drawable.ic_moreoption,R.drawable.ic_moreoption,R.drawable.ic_moreoption
            ,R.drawable.ic_moreoption,R.drawable.ic_moreoption,R.drawable.ic_moreoption,R.drawable.ic_moreoption
            ,R.drawable.ic_moreoption,R.drawable.ic_moreoption,R.drawable.ic_moreoption,R.drawable.ic_moreoption,R.drawable.ic_moreoption};

    /*ArrayList<HinhAnh> arrayList;
    GridviewTrangchuAdapter adapter,anh_adapter;

    //Mang luu danh sach cac id hinh anh co san
    Integer[] thumbIds;
    //Adapter cho GridView
    myImageAdapter img_adapter=null;
    //Vì không tạo thêm 1 Activity nên lấy luôn Id ở bên Layout Trang chu 1.xml
    ImageView img_Picture,Button_Back;
    //Lưu Bundle backup cho MainActivity
    Bundle myBackupBundle;*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Lưu savedInstanceState trước vào myBackupBundle
        /*myBackupBundle = savedInstanceState;*/
        setContentView(R.layout.layout_trangchu);

        //gán mảng các Id hình ảnh cho thumbIds

       /* thumbIds=new Integer[]{R.drawable.hoa,R.drawable.nghethuat,R.drawable.mongtay,R.drawable.giaoduc,R.drawable.anime
                ,R.drawable.nhiepanh,R.drawable.dog4,R.drawable.suckhoe,R.drawable.thietke,R.drawable.mattrang,R.drawable.trangsuc
                ,R.drawable.xedep,R.drawable.bautroixanh,R.drawable.koi,R.drawable.hinhxam};*/
        gridView=(GridView) findViewById(R.id.gridView_trangchu);
        /*//thiết lập Datasource cho Adapter
        img_adapter = new myImageAdapter(this,thumbIds);
        //Gán adapter vào Gridview
        gridView.setAdapter(img_adapter);*/



       /* arrayList = new ArrayList<>();
        DataArray();
        adapter = new GridviewTrangchuAdapter(this,R.layout.custom_layout_gridview_trangchu,arrayList);
        anh_adapter = new GridviewTrangchuAdapter(this,thumbIds);
        gridView.setAdapter(anh_adapter);
        //Thiết lập sự kiện để mở từng hình ảnh chi tiết
        gridView.setOnItemClickListener(this);*/

       CustomAdapter customAdapter = new CustomAdapter();
       gridView.setAdapter(customAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(),LayoutTrangchu1Activity.class);
                intent.putExtra("name",imageName[position]);
                intent.putExtra("image",images[position]);
                startActivity(intent);
            }
        });
    }

   /* public void DataArray(){
        arrayList.add(new HinhAnh("Hoa",R.drawable.hoa,R.drawable.ic_moreoption));
        arrayList.add(new HinhAnh("Nghệ thuật",R.drawable.nghethuat,R.drawable.ic_moreoption));
        arrayList.add(new HinhAnh("Móng tay",R.drawable.mongtay,R.drawable.ic_moreoption));
        arrayList.add(new HinhAnh("Giáo dục",R.drawable.giaoduc,R.drawable.ic_moreoption));
        arrayList.add(new HinhAnh("Anime",R.drawable.anime,R.drawable.ic_moreoption));
        arrayList.add(new HinhAnh("Nhiếp ảnh",R.drawable.nhiepanh,R.drawable.ic_moreoption));
        arrayList.add(new HinhAnh("Động vật",R.drawable.dog4,R.drawable.ic_moreoption));
        arrayList.add(new HinhAnh("Sức khỏe",R.drawable.suckhoe,R.drawable.ic_moreoption));
        arrayList.add(new HinhAnh("Thiết kế",R.drawable.thietke,R.drawable.ic_moreoption));
        arrayList.add(new HinhAnh("Mặt trăng",R.drawable.mattrang,R.drawable.ic_moreoption));
        arrayList.add(new HinhAnh("Trang sức",R.drawable.trangsuc,R.drawable.ic_moreoption));
        arrayList.add(new HinhAnh("Xe",R.drawable.xedep,R.drawable.ic_moreoption));
        arrayList.add(new HinhAnh("Bầu trời xanh",R.drawable.bautroixanh,R.drawable.ic_moreoption));
        arrayList.add(new HinhAnh("Koi",R.drawable.koi,R.drawable.ic_moreoption));
        arrayList.add(new HinhAnh("Hình xăm",R.drawable.hinhxam,R.drawable.ic_moreoption));
           }*/

    /*@Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        showdetail(position);
    }
    public  void showdetail(int position){
        //Không mở Activity mới mà chỉ thiết lập lại Layout
        setContentView(R.layout.layout_trangchu_1);
        //Vừa gọi hàm trên thì màn hình sẽ thay đổi qua cái mới
        //ta lấy các control trong layout mới này
      *//*  tvSoloMsg=(TextView) findViewById(R.id.tvSoloMsg);
        tvSoloMsg.setText("Image at "+posistion);*//*
        img_Picture=(ImageView) findViewById(R.id.img_clicked);
        //thiết lập hình ảnh đang chọn lên ImageView mới
        HinhAnh hinhAnh = arrayList.get(position);
        img_Picture.setImageResource(hinhAnh.getHinh());
        Button_Back=(ImageView) findViewById(R.id.button_back);
        //Thiết lập sự kiện click Back để phục hồi lại MainActivity
        //bằng cách gọi lại onCreate(myBackupBundle);
        Button_Back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                onCreate(myBackupBundle);
            }
        });

    }*/

    private class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view1 = getLayoutInflater().inflate(R.layout.custom_layout_gridview_trangchu,null);
            TextView name =view1.findViewById(R.id.txtNameTrangChu);
            ImageView image = view1.findViewById(R.id.imgHinhTrangChu);
            ImageView button = view1.findViewById(R.id.img_Option);

            button.setImageResource(imgButton[position]);
            name.setText(imageName[position]);
            image.setImageResource(images[position]);
            return view1;
        }
    }
}