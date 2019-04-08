package com.exercise.raynard.kursusera;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.CourseViewHolder> {
    List<CourseData> courses;
    private Context context;

    public RVAdapter(List<CourseData> courses, Context context) {
        this.courses = courses;
        this.context = context;
    }

    @Override
    public CourseViewHolder onCreateViewHolder(ViewGroup viewGroup, int position) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_content_model, viewGroup, false);
//        if (position == 0) {
//            // inflate yg model pertama (judul rv)
//            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_model, viewGroup, false);
////        } else if (position == getItemCount() - 1) {
//            // inflate see all
//        } else {
//            // inflate main item
//            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_content_model, viewGroup, false);
//        }
        return new CourseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CourseViewHolder courseViewHolder, int i) {
        CourseData item = courses.get(i);

        courseViewHolder.courseDesc.setText(item.getCourseDesc());
        courseViewHolder.courseTitle.setText(item.getCourseTitle());
//        courseViewHolder.courseImage.setImageResource(courses.get());

        Glide.with(context).load(item.getCourseImage()).into(courseViewHolder.courseImage);
    }

    @Override
    public int getItemCount() {
        return courses.size();
    }

    public static class CourseViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView courseTitle;
        TextView courseDesc;
        ImageView courseImage;

//        public CourseViewHolder(@NonNull View itemView, CardView cardView, TextView courseTitle, TextView corseDesc, ImageView courseImage) {
//            super(itemView);
//            this.courseTitle = courseTitle;
//            this.corseDesc = corseDesc;
//            this.courseImage = courseImage;
//        }

        public CourseViewHolder(View itemView) {
            super(itemView);
            courseTitle = itemView.findViewById(R.id.card_title);
            courseDesc = itemView.findViewById(R.id.card_description);
            courseImage = itemView.findViewById(R.id.card_image);
        }
    }
}
