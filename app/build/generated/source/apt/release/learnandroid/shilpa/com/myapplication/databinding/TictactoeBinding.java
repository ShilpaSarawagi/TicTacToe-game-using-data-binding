package learnandroid.shilpa.com.myapplication.databinding;
import learnandroid.shilpa.com.myapplication.R;
import learnandroid.shilpa.com.myapplication.BR;
import android.view.View;
public class TictactoeBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.buttonGrid, 12);
    }
    // views
    public final android.widget.GridLayout buttonGrid;
    private final android.widget.Button mboundView1;
    private final android.widget.Button mboundView2;
    private final android.widget.Button mboundView3;
    private final android.widget.Button mboundView4;
    private final android.widget.Button mboundView5;
    private final android.widget.Button mboundView6;
    private final android.widget.Button mboundView7;
    private final android.widget.Button mboundView8;
    private final android.widget.Button mboundView9;
    public final android.widget.LinearLayout tictactoe;
    public final android.widget.TextView winnerPlayerLabel;
    public final android.widget.LinearLayout winnerPlayerViewGroup;
    // variables
    private learnandroid.shilpa.com.myapplication.viewmodel.TicTacToeViewModel mViewModel;
    private final android.view.View.OnClickListener mCallback4;
    private final android.view.View.OnClickListener mCallback3;
    private final android.view.View.OnClickListener mCallback2;
    private final android.view.View.OnClickListener mCallback1;
    private final android.view.View.OnClickListener mCallback9;
    private final android.view.View.OnClickListener mCallback8;
    private final android.view.View.OnClickListener mCallback7;
    private final android.view.View.OnClickListener mCallback6;
    private final android.view.View.OnClickListener mCallback5;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public TictactoeBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 2);
        final Object[] bindings = mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds);
        this.buttonGrid = (android.widget.GridLayout) bindings[12];
        this.mboundView1 = (android.widget.Button) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.Button) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.Button) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.Button) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.Button) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.Button) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.Button) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.Button) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.Button) bindings[9];
        this.mboundView9.setTag(null);
        this.tictactoe = (android.widget.LinearLayout) bindings[0];
        this.tictactoe.setTag(null);
        this.winnerPlayerLabel = (android.widget.TextView) bindings[11];
        this.winnerPlayerLabel.setTag(null);
        this.winnerPlayerViewGroup = (android.widget.LinearLayout) bindings[10];
        this.winnerPlayerViewGroup.setTag(null);
        setRootTag(root);
        // listeners
        mCallback4 = new android.databinding.generated.callback.OnClickListener(this, 4);
        mCallback3 = new android.databinding.generated.callback.OnClickListener(this, 3);
        mCallback2 = new android.databinding.generated.callback.OnClickListener(this, 2);
        mCallback1 = new android.databinding.generated.callback.OnClickListener(this, 1);
        mCallback9 = new android.databinding.generated.callback.OnClickListener(this, 9);
        mCallback8 = new android.databinding.generated.callback.OnClickListener(this, 8);
        mCallback7 = new android.databinding.generated.callback.OnClickListener(this, 7);
        mCallback6 = new android.databinding.generated.callback.OnClickListener(this, 6);
        mCallback5 = new android.databinding.generated.callback.OnClickListener(this, 5);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    public boolean setVariable(int variableId, Object variable) {
        switch(variableId) {
            case BR.viewModel :
                setViewModel((learnandroid.shilpa.com.myapplication.viewmodel.TicTacToeViewModel) variable);
                return true;
        }
        return false;
    }

    public void setViewModel(learnandroid.shilpa.com.myapplication.viewmodel.TicTacToeViewModel viewModel) {
        this.mViewModel = viewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    public learnandroid.shilpa.com.myapplication.viewmodel.TicTacToeViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeWinnerViewMo((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeCellsViewMod((android.databinding.ObservableArrayMap<java.lang.String,java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeWinnerViewMo(android.databinding.ObservableField<java.lang.String> winnerViewModel, int fieldId) {
        switch (fieldId) {
            case BR._all: {
                synchronized(this) {
                        mDirtyFlags |= 0x1L;
                }
                return true;
            }
        }
        return false;
    }
    private boolean onChangeCellsViewMod(android.databinding.ObservableArrayMap<java.lang.String,java.lang.String> cellsViewModel, int fieldId) {
        switch (fieldId) {
            case BR._all: {
                synchronized(this) {
                        mDirtyFlags |= 0x2L;
                }
                return true;
            }
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        learnandroid.shilpa.com.myapplication.viewmodel.TicTacToeViewModel viewModel = mViewModel;
        java.lang.String cellsViewModelString = null;
        java.lang.String cellsViewModelString1 = null;
        java.lang.String cellsViewModelString2 = null;
        android.databinding.ObservableField<java.lang.String> winnerViewModel = null;
        java.lang.String winnerViewModel1 = null;
        boolean winnerViewModelObjec = false;
        java.lang.String cellsViewModelString3 = null;
        java.lang.String cellsViewModelString4 = null;
        java.lang.String cellsViewModelString5 = null;
        java.lang.String cellsViewModelString6 = null;
        android.databinding.ObservableArrayMap<java.lang.String,java.lang.String> cellsViewModel = null;
        int WinnerViewModelObjec1 = 0;
        java.lang.String cellsViewModelString7 = null;
        java.lang.String cellsViewModelString8 = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.winner
                        winnerViewModel = viewModel.winner;
                    }
                    updateRegistration(0, winnerViewModel);


                    if (winnerViewModel != null) {
                        // read viewModel.winner.get()
                        winnerViewModel1 = winnerViewModel.get();
                    }


                    // read viewModel.winner.get() != null
                    winnerViewModelObjec = (winnerViewModel1) != (null);
                    if((dirtyFlags & 0xdL) != 0) {
                        if (winnerViewModelObjec) {
                            dirtyFlags |= 0x20L;
                        } else {
                            dirtyFlags |= 0x10L;
                        }}


                    // read viewModel.winner.get() != null ? View.VISIBLE : View.GONE
                    WinnerViewModelObjec1 = (winnerViewModelObjec) ? (android.view.View.VISIBLE) : (android.view.View.GONE);
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.cells
                        cellsViewModel = viewModel.cells;
                    }
                    updateRegistration(1, cellsViewModel);


                    if (cellsViewModel != null) {
                        // read viewModel.cells["11"]
                        cellsViewModelString = cellsViewModel.get("11");
                        // read viewModel.cells["20"]
                        cellsViewModelString1 = cellsViewModel.get("20");
                        // read viewModel.cells["00"]
                        cellsViewModelString2 = cellsViewModel.get("00");
                        // read viewModel.cells["12"]
                        cellsViewModelString3 = cellsViewModel.get("12");
                        // read viewModel.cells["21"]
                        cellsViewModelString4 = cellsViewModel.get("21");
                        // read viewModel.cells["01"]
                        cellsViewModelString5 = cellsViewModel.get("01");
                        // read viewModel.cells["10"]
                        cellsViewModelString6 = cellsViewModel.get("10");
                        // read viewModel.cells["22"]
                        cellsViewModelString7 = cellsViewModel.get("22");
                        // read viewModel.cells["02"]
                        cellsViewModelString8 = cellsViewModel.get("02");
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback1);
            this.mboundView2.setOnClickListener(mCallback2);
            this.mboundView3.setOnClickListener(mCallback3);
            this.mboundView4.setOnClickListener(mCallback4);
            this.mboundView5.setOnClickListener(mCallback5);
            this.mboundView6.setOnClickListener(mCallback6);
            this.mboundView7.setOnClickListener(mCallback7);
            this.mboundView8.setOnClickListener(mCallback8);
            this.mboundView9.setOnClickListener(mCallback9);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, cellsViewModelString2);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, cellsViewModelString5);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, cellsViewModelString8);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, cellsViewModelString6);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, cellsViewModelString);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, cellsViewModelString3);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, cellsViewModelString1);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, cellsViewModelString4);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, cellsViewModelString7);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.winnerPlayerLabel, winnerViewModel1);
            this.winnerPlayerViewGroup.setVisibility(WinnerViewModelObjec1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // viewModel != null
                boolean viewModelObjectnull = false;
                // viewModel
                learnandroid.shilpa.com.myapplication.viewmodel.TicTacToeViewModel viewModel = mViewModel;



                viewModelObjectnull = (viewModel) != (null);
                if (viewModelObjectnull) {




                    viewModel.onClickedCellAt(1, 0);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel != null
                boolean viewModelObjectnull = false;
                // viewModel
                learnandroid.shilpa.com.myapplication.viewmodel.TicTacToeViewModel viewModel = mViewModel;



                viewModelObjectnull = (viewModel) != (null);
                if (viewModelObjectnull) {




                    viewModel.onClickedCellAt(0, 2);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel != null
                boolean viewModelObjectnull = false;
                // viewModel
                learnandroid.shilpa.com.myapplication.viewmodel.TicTacToeViewModel viewModel = mViewModel;



                viewModelObjectnull = (viewModel) != (null);
                if (viewModelObjectnull) {




                    viewModel.onClickedCellAt(0, 1);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel != null
                boolean viewModelObjectnull = false;
                // viewModel
                learnandroid.shilpa.com.myapplication.viewmodel.TicTacToeViewModel viewModel = mViewModel;



                viewModelObjectnull = (viewModel) != (null);
                if (viewModelObjectnull) {




                    viewModel.onClickedCellAt(0, 0);
                }
                break;
            }
            case 9: {
                // localize variables for thread safety
                // viewModel != null
                boolean viewModelObjectnull = false;
                // viewModel
                learnandroid.shilpa.com.myapplication.viewmodel.TicTacToeViewModel viewModel = mViewModel;



                viewModelObjectnull = (viewModel) != (null);
                if (viewModelObjectnull) {




                    viewModel.onClickedCellAt(2, 2);
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // viewModel != null
                boolean viewModelObjectnull = false;
                // viewModel
                learnandroid.shilpa.com.myapplication.viewmodel.TicTacToeViewModel viewModel = mViewModel;



                viewModelObjectnull = (viewModel) != (null);
                if (viewModelObjectnull) {




                    viewModel.onClickedCellAt(2, 1);
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // viewModel != null
                boolean viewModelObjectnull = false;
                // viewModel
                learnandroid.shilpa.com.myapplication.viewmodel.TicTacToeViewModel viewModel = mViewModel;



                viewModelObjectnull = (viewModel) != (null);
                if (viewModelObjectnull) {




                    viewModel.onClickedCellAt(2, 0);
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // viewModel != null
                boolean viewModelObjectnull = false;
                // viewModel
                learnandroid.shilpa.com.myapplication.viewmodel.TicTacToeViewModel viewModel = mViewModel;



                viewModelObjectnull = (viewModel) != (null);
                if (viewModelObjectnull) {




                    viewModel.onClickedCellAt(1, 2);
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewModel != null
                boolean viewModelObjectnull = false;
                // viewModel
                learnandroid.shilpa.com.myapplication.viewmodel.TicTacToeViewModel viewModel = mViewModel;



                viewModelObjectnull = (viewModel) != (null);
                if (viewModelObjectnull) {




                    viewModel.onClickedCellAt(1, 1);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static TictactoeBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static TictactoeBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<TictactoeBinding>inflate(inflater, learnandroid.shilpa.com.myapplication.R.layout.tictactoe, root, attachToRoot, bindingComponent);
    }
    public static TictactoeBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static TictactoeBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(learnandroid.shilpa.com.myapplication.R.layout.tictactoe, null, false), bindingComponent);
    }
    public static TictactoeBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static TictactoeBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/tictactoe_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new TictactoeBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel.winner
        flag 1 (0x2L): viewModel.cells
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): viewModel.winner.get() != null ? View.VISIBLE : View.GONE
        flag 5 (0x6L): viewModel.winner.get() != null ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}