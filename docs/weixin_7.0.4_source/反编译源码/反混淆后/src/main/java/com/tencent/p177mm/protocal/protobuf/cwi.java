package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.C6092b;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.cwi */
public class cwi extends btd {
    public cmi xsa;
    public LinkedList<C35920fu> xsb = new LinkedList();

    public cwi() {
        AppMethodBeat.m2504i(102432);
        AppMethodBeat.m2505o(102432);
    }

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(102433);
        C6092b c6092b;
        int ix;
        byte[] bArr;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.BaseResponse == null) {
                c6092b = new C6092b("Not all required fields were included: BaseResponse");
                AppMethodBeat.m2505o(102433);
                throw c6092b;
            }
            if (this.BaseResponse != null) {
                c6093a.mo13479iy(1, this.BaseResponse.computeSize());
                this.BaseResponse.writeFields(c6093a);
            }
            if (this.xsa != null) {
                c6093a.mo13479iy(2, this.xsa.computeSize());
                this.xsa.writeFields(c6093a);
            }
            c6093a.mo13474e(3, 8, this.xsb);
            AppMethodBeat.m2505o(102433);
            return 0;
        } else if (i == 1) {
            if (this.BaseResponse != null) {
                ix = C6087a.m9557ix(1, this.BaseResponse.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.xsa != null) {
                ix += C6087a.m9557ix(2, this.xsa.computeSize());
            }
            int c = ix + C6087a.m9552c(3, 8, this.xsb);
            AppMethodBeat.m2505o(102433);
            return c;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.xsb.clear();
            C6086a c6086a = new C6086a(bArr, unknownTagHandler);
            for (ix = C1331a.getNextFieldNumber(c6086a); ix > 0; ix = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, ix)) {
                    c6086a.ems();
                }
            }
            if (this.BaseResponse == null) {
                c6092b = new C6092b("Not all required fields were included: BaseResponse");
                AppMethodBeat.m2505o(102433);
                throw c6092b;
            }
            AppMethodBeat.m2505o(102433);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            cwi cwi = (cwi) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            C6086a c6086a3;
            boolean z;
            switch (intValue) {
                case 1:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        BaseResponse baseResponse = new BaseResponse();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = baseResponse.populateBuilderWithField(c6086a3, baseResponse, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        cwi.BaseResponse = baseResponse;
                    }
                    AppMethodBeat.m2505o(102433);
                    return 0;
                case 2:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        cmi cmi = new cmi();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = cmi.populateBuilderWithField(c6086a3, cmi, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        cwi.xsa = cmi;
                    }
                    AppMethodBeat.m2505o(102433);
                    return 0;
                case 3:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        C35920fu c35920fu = new C35920fu();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = c35920fu.populateBuilderWithField(c6086a3, c35920fu, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        cwi.xsb.add(c35920fu);
                    }
                    AppMethodBeat.m2505o(102433);
                    return 0;
                default:
                    AppMethodBeat.m2505o(102433);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(102433);
            return -1;
        }
    }
}
