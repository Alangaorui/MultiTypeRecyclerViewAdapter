package com.crazysunj.sample.normal;

import android.support.annotation.Nullable;
import android.widget.LinearLayout;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.coorchice.library.SuperTextView;
import com.crazysunj.sample.R;
import com.crazysunj.sample.entity.ItemEntity2;

import java.util.List;

/**
 * author: sunjian
 * created on: 2017/8/22 下午2:23
 * description:
 */

public class Type2Adapter extends BaseQuickAdapter<ItemEntity2, BaseViewHolder> {

    public Type2Adapter(@Nullable List<ItemEntity2> data) {
        super(R.layout.item_2, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, ItemEntity2 item) {
        helper.setImageResource(R.id.item_2_img, item.getImg());
        helper.setText(R.id.item_2_title, item.getTitle());
        helper.setText(R.id.item_2_content, item.getContent());
        helper.setText(R.id.item_2_price, item.getPrice());
        LinearLayout tagParent = helper.getView(R.id.item_2_tags);
        tagParent.removeAllViews();
        List<String> tags = item.getTags();
        for (String tag : tags) {
            SuperTextView view = (SuperTextView) mLayoutInflater.inflate(R.layout.label_tag, tagParent, false);
            view.setText(tag);
            tagParent.addView(view);
        }
    }
}
