package com.cq.hhxk.voice.voiceoperationsystem.adapter;

import android.graphics.Color;

import com.cq.hhxk.voice.voiceoperationsystem.R;
import com.cq.hhxk.voice.voiceoperationsystem.pojo.ExhibitionVENPojo;
import com.em.baseframe.adapter.recyclerview.BaseQuickAdapter;
import com.em.baseframe.adapter.recyclerview.BaseViewHolder;

import java.util.List;

public class ExhibitionVENAdapter extends BaseQuickAdapter<ExhibitionVENPojo, BaseViewHolder> {
    public ExhibitionVENAdapter(int layoutResId, List<ExhibitionVENPojo> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, ExhibitionVENPojo item) {
        if (item.getColor() % 2 != 0) {
            helper.setBackgroundColor(R.id.lin, Color.parseColor("#0F1942"));
        } else {
            helper.setBackgroundColor(R.id.lin, Color.parseColor("#141F4C"));
        }
    }
}
