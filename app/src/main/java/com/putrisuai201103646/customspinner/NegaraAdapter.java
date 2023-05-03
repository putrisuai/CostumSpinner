package com.putrisuai201103646.customspinner;

import android.content.Context;
import android.widget.BaseAdapter;

import java.util.List;

public class NegaraAdapter extends BaseAdapter {
    private Context _context;
    private List<String> _negaraList;

    public NegaraAdapter(Context _context, List<String> _negaraList) {
        this._context = _context;
        this._negaraList = _negaraList;
    }

    @Override
    public int getCount() {
        //return (negaraList != null) ? negaraList.size() : 0;

        if (_negaraList != null) {
            return _negaraList.size();
        }
        else {
            return 0;
        }
    }
}
