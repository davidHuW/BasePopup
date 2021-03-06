package razerdp.demo.popup;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.OnClick;
import razerdp.basepopup.BasePopupWindow;
import razerdp.basepopup.R;
import razerdp.demo.utils.ButterKnifeUtil;
import razerdp.demo.utils.UIHelper;

/**
 * Created by 大灯泡 on 2019/9/20
 * <p>
 * Description：{@link razerdp.demo.model.common.CommonSlideInfo}
 */
public class PopupSlide extends BasePopupWindow {

    @BindView(R.id.tv_item_1)
    TextView tvItem1;
    @BindView(R.id.tv_item_2)
    TextView tvItem2;
    @BindView(R.id.tv_item_3)
    TextView tvItem3;

    public PopupSlide(Context context) {
        super(context);
        ButterKnifeUtil.bind(this,getContentView());
    }

    @Override
    public View onCreateContentView() {
        return createPopupById(R.layout.popup_slide);
    }

    @OnClick({R.id.tv_item_1, R.id.tv_item_2, R.id.tv_item_3})
    void click(View v) {
        UIHelper.toast(((TextView) v).getText().toString());
    }
}
