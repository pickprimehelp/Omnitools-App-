package com.example.ui.screens;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.material.icons.filled.InfoKt;
import androidx.compose.material.icons.filled.SearchKt;
import androidx.compose.material.icons.filled.SecurityKt;
import androidx.compose.material.icons.filled.ShareKt;
import androidx.compose.material.icons.filled.StarKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeScreen.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposableSingletons$HomeScreenKt {
    public static final ComposableSingletons$HomeScreenKt INSTANCE = new ComposableSingletons$HomeScreenKt();
    private static Function2<Composer, Integer, Unit> lambda$1872505473 = ComposableLambdaKt.composableLambdaInstance(1872505473, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$HomeScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$HomeScreenKt.lambda_1872505473$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-1494162592, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f100lambda$1494162592 = ComposableLambdaKt.composableLambdaInstance(-1494162592, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$HomeScreenKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$HomeScreenKt.lambda__1494162592$lambda$1((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-1220728046, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f95lambda$1220728046 = ComposableLambdaKt.composableLambdaInstance(-1220728046, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$HomeScreenKt$$ExternalSyntheticLambda12
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$HomeScreenKt.lambda__1220728046$lambda$2((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1374619010 = ComposableLambdaKt.composableLambdaInstance(1374619010, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$HomeScreenKt$$ExternalSyntheticLambda13
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$HomeScreenKt.lambda_1374619010$lambda$3((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-1255676231, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f96lambda$1255676231 = ComposableLambdaKt.composableLambdaInstance(-1255676231, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$HomeScreenKt$$ExternalSyntheticLambda14
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$HomeScreenKt.lambda__1255676231$lambda$4((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-1086424646, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f89lambda$1086424646 = ComposableLambdaKt.composableLambdaInstance(-1086424646, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$HomeScreenKt$$ExternalSyntheticLambda15
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$HomeScreenKt.lambda__1086424646$lambda$5((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-917173061, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f109lambda$917173061 = ComposableLambdaKt.composableLambdaInstance(-917173061, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$HomeScreenKt$$ExternalSyntheticLambda16
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$HomeScreenKt.lambda__917173061$lambda$6((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-747921476, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f108lambda$747921476 = ComposableLambdaKt.composableLambdaInstance(-747921476, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$HomeScreenKt$$ExternalSyntheticLambda17
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$HomeScreenKt.lambda__747921476$lambda$7((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$2139349522 = ComposableLambdaKt.composableLambdaInstance(2139349522, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$HomeScreenKt$$ExternalSyntheticLambda18
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$HomeScreenKt.lambda_2139349522$lambda$8((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-712675347, reason: not valid java name */
    private static Function3<ColumnScope, Composer, Integer, Unit> f106lambda$712675347 = ComposableLambdaKt.composableLambdaInstance(-712675347, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$HomeScreenKt$$ExternalSyntheticLambda19
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$HomeScreenKt.lambda__712675347$lambda$12((ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1673063711 = ComposableLambdaKt.composableLambdaInstance(1673063711, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$HomeScreenKt$$ExternalSyntheticLambda11
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$HomeScreenKt.lambda_1673063711$lambda$13((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-963494529, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f110lambda$963494529 = ComposableLambdaKt.composableLambdaInstance(-963494529, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$HomeScreenKt$$ExternalSyntheticLambda20
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$HomeScreenKt.lambda__963494529$lambda$15((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$103313418 = ComposableLambdaKt.composableLambdaInstance(103313418, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$HomeScreenKt$$ExternalSyntheticLambda21
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$HomeScreenKt.lambda_103313418$lambda$16((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-1200112354, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f94lambda$1200112354 = ComposableLambdaKt.composableLambdaInstance(-1200112354, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$HomeScreenKt$$ExternalSyntheticLambda22
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$HomeScreenKt.lambda__1200112354$lambda$18((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-133304407, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f97lambda$133304407 = ComposableLambdaKt.composableLambdaInstance(-133304407, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$HomeScreenKt$$ExternalSyntheticLambda23
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$HomeScreenKt.lambda__133304407$lambda$19((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$722561730 = ComposableLambdaKt.composableLambdaInstance(722561730, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$HomeScreenKt$$ExternalSyntheticLambda24
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$HomeScreenKt.lambda_722561730$lambda$20((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-1106425773, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f90lambda$1106425773 = ComposableLambdaKt.composableLambdaInstance(-1106425773, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$HomeScreenKt$$ExternalSyntheticLambda25
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$HomeScreenKt.lambda__1106425773$lambda$21((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-1365891026, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f98lambda$1365891026 = ComposableLambdaKt.composableLambdaInstance(-1365891026, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$HomeScreenKt$$ExternalSyntheticLambda26
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$HomeScreenKt.lambda__1365891026$lambda$23((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-1411711716, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f99lambda$1411711716 = ComposableLambdaKt.composableLambdaInstance(-1411711716, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$HomeScreenKt$$ExternalSyntheticLambda27
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$HomeScreenKt.lambda__1411711716$lambda$25((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-671244019, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f105lambda$671244019 = ComposableLambdaKt.composableLambdaInstance(-671244019, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$HomeScreenKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$HomeScreenKt.lambda__671244019$lambda$27((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-1165881844, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f93lambda$1165881844 = ComposableLambdaKt.composableLambdaInstance(-1165881844, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$HomeScreenKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$HomeScreenKt.lambda__1165881844$lambda$28((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-2027168411, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f103lambda$2027168411 = ComposableLambdaKt.composableLambdaInstance(-2027168411, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$HomeScreenKt$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$HomeScreenKt.lambda__2027168411$lambda$30((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-399639202, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f104lambda$399639202 = ComposableLambdaKt.composableLambdaInstance(-399639202, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$HomeScreenKt$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$HomeScreenKt.lambda__399639202$lambda$31((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-720335460, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f107lambda$720335460 = ComposableLambdaKt.composableLambdaInstance(-720335460, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$HomeScreenKt$$ExternalSyntheticLambda6
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$HomeScreenKt.lambda__720335460$lambda$32((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-1152349043, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f91lambda$1152349043 = ComposableLambdaKt.composableLambdaInstance(-1152349043, false, new Function3() { // from class: com.example.ui.screens.ComposableSingletons$HomeScreenKt$$ExternalSyntheticLambda7
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$HomeScreenKt.lambda__1152349043$lambda$33((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-2013635610, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f102lambda$2013635610 = ComposableLambdaKt.composableLambdaInstance(-2013635610, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$HomeScreenKt$$ExternalSyntheticLambda8
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$HomeScreenKt.lambda__2013635610$lambda$35((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-177792763, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f101lambda$177792763 = ComposableLambdaKt.composableLambdaInstance(-177792763, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$HomeScreenKt$$ExternalSyntheticLambda9
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$HomeScreenKt.lambda__177792763$lambda$37((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-1157243586, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f92lambda$1157243586 = ComposableLambdaKt.composableLambdaInstance(-1157243586, false, new Function2() { // from class: com.example.ui.screens.ComposableSingletons$HomeScreenKt$$ExternalSyntheticLambda10
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$HomeScreenKt.lambda__1157243586$lambda$38((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: getLambda$-1086424646$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6992getLambda$1086424646$app() {
        return f89lambda$1086424646;
    }

    /* renamed from: getLambda$-1106425773$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m6993getLambda$1106425773$app() {
        return f90lambda$1106425773;
    }

    /* renamed from: getLambda$-1152349043$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m6994getLambda$1152349043$app() {
        return f91lambda$1152349043;
    }

    /* renamed from: getLambda$-1157243586$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6995getLambda$1157243586$app() {
        return f92lambda$1157243586;
    }

    /* renamed from: getLambda$-1165881844$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m6996getLambda$1165881844$app() {
        return f93lambda$1165881844;
    }

    /* renamed from: getLambda$-1200112354$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6997getLambda$1200112354$app() {
        return f94lambda$1200112354;
    }

    /* renamed from: getLambda$-1220728046$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6998getLambda$1220728046$app() {
        return f95lambda$1220728046;
    }

    /* renamed from: getLambda$-1255676231$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6999getLambda$1255676231$app() {
        return f96lambda$1255676231;
    }

    /* renamed from: getLambda$-133304407$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7000getLambda$133304407$app() {
        return f97lambda$133304407;
    }

    /* renamed from: getLambda$-1365891026$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7001getLambda$1365891026$app() {
        return f98lambda$1365891026;
    }

    /* renamed from: getLambda$-1411711716$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7002getLambda$1411711716$app() {
        return f99lambda$1411711716;
    }

    /* renamed from: getLambda$-1494162592$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7003getLambda$1494162592$app() {
        return f100lambda$1494162592;
    }

    /* renamed from: getLambda$-177792763$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7004getLambda$177792763$app() {
        return f101lambda$177792763;
    }

    /* renamed from: getLambda$-2013635610$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7005getLambda$2013635610$app() {
        return f102lambda$2013635610;
    }

    /* renamed from: getLambda$-2027168411$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7006getLambda$2027168411$app() {
        return f103lambda$2027168411;
    }

    /* renamed from: getLambda$-399639202$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7007getLambda$399639202$app() {
        return f104lambda$399639202;
    }

    /* renamed from: getLambda$-671244019$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7008getLambda$671244019$app() {
        return f105lambda$671244019;
    }

    /* renamed from: getLambda$-712675347$app, reason: not valid java name */
    public final Function3<ColumnScope, Composer, Integer, Unit> m7009getLambda$712675347$app() {
        return f106lambda$712675347;
    }

    /* renamed from: getLambda$-720335460$app, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7010getLambda$720335460$app() {
        return f107lambda$720335460;
    }

    /* renamed from: getLambda$-747921476$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7011getLambda$747921476$app() {
        return f108lambda$747921476;
    }

    /* renamed from: getLambda$-917173061$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7012getLambda$917173061$app() {
        return f109lambda$917173061;
    }

    /* renamed from: getLambda$-963494529$app, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7013getLambda$963494529$app() {
        return f110lambda$963494529;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$103313418$app() {
        return lambda$103313418;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1374619010$app() {
        return lambda$1374619010;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1673063711$app() {
        return lambda$1673063711;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1872505473$app() {
        return lambda$1872505473;
    }

    public final Function2<Composer, Integer, Unit> getLambda$2139349522$app() {
        return lambda$2139349522;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$722561730$app() {
        return lambda$722561730;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_1872505473$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C176@7613L45:HomeScreen.kt#2thlc2");
        if (($changed & 3) != 2 || !$composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1872505473, $changed, -1, "com.example.ui.screens.ComposableSingletons$HomeScreenKt.lambda$1872505473.<anonymous> (HomeScreen.kt:176)");
            }
            TextKt.m2696Text4IGK_g("Search 40+ tools...", (Modifier) null, 0L, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3078, 0, 131062);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__1494162592$lambda$1(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C188@8404L94:HomeScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1494162592, $changed, -1, "com.example.ui.screens.ComposableSingletons$HomeScreenKt.lambda$-1494162592.<anonymous> (HomeScreen.kt:188)");
            }
            IconKt.m2153Iconww6aTOc(CloseKt.getClose(Icons.Filled.INSTANCE), "Close Search", SizeKt.m718size3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(18)), 0L, $composer, 432, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__1220728046$lambda$2(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C209@9610L11,205@9367L405:HomeScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1220728046, $changed, -1, "com.example.ui.screens.ComposableSingletons$HomeScreenKt.lambda$-1220728046.<anonymous> (HomeScreen.kt:205)");
            }
            TextKt.m2696Text4IGK_g("PRO", PaddingKt.m674paddingVpY3zN4(Modifier.INSTANCE, Dp.m6625constructorimpl(6), Dp.m6625constructorimpl(2)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), TextUnitKt.getSp(10), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199734, 0, 131024);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_1374619010$lambda$3(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C219@10077L62:HomeScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1374619010, $changed, -1, "com.example.ui.screens.ComposableSingletons$HomeScreenKt.lambda$1374619010.<anonymous> (HomeScreen.kt:219)");
            }
            IconKt.m2153Iconww6aTOc(SearchKt.getSearch(Icons.Filled.INSTANCE), "Search Tools", (Modifier) null, 0L, $composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__1255676231$lambda$4(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C222@10349L11,222@10269L100:HomeScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1255676231, $changed, -1, "com.example.ui.screens.ComposableSingletons$HomeScreenKt.lambda$-1255676231.<anonymous> (HomeScreen.kt:222)");
            }
            IconKt.m2153Iconww6aTOc(ShareKt.getShare(Icons.Filled.INSTANCE), "Share App", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), $composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__1086424646$lambda$5(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C225@10512L82:HomeScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1086424646, $changed, -1, "com.example.ui.screens.ComposableSingletons$HomeScreenKt.lambda$-1086424646.<anonymous> (HomeScreen.kt:225)");
            }
            IconKt.m2153Iconww6aTOc(StarKt.getStar(Icons.Filled.INSTANCE), "Rate App", (Modifier) null, ColorKt.Color(4294286859L), $composer, 3120, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__917173061$lambda$6(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C228@10826L11,228@10738L108:HomeScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-917173061, $changed, -1, "com.example.ui.screens.ComposableSingletons$HomeScreenKt.lambda$-917173061.<anonymous> (HomeScreen.kt:228)");
            }
            IconKt.m2153Iconww6aTOc(SecurityKt.getSecurity(Icons.Filled.INSTANCE), "Privacy Policy", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), $composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__747921476$lambda$7(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C231@10987L57:HomeScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-747921476, $changed, -1, "com.example.ui.screens.ComposableSingletons$HomeScreenKt.lambda$-747921476.<anonymous> (HomeScreen.kt:231)");
            }
            IconKt.m2153Iconww6aTOc(InfoKt.getInfo(Icons.Filled.INSTANCE), "About App", (Modifier) null, 0L, $composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_1673063711$lambda$13(LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C258@12104L46,259@12201L38,253@11830L3191:HomeScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1673063711, $changed, -1, "com.example.ui.screens.ComposableSingletons$HomeScreenKt.lambda$1673063711.<anonymous> (HomeScreen.kt:253)");
            }
            CardKt.Card(PaddingKt.m674paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6625constructorimpl(16), Dp.m6625constructorimpl(4)), RoundedCornerShapeKt.m956RoundedCornerShape0680j_4(Dp.m6625constructorimpl(20)), CardDefaults.INSTANCE.m1832cardColorsro_MJ88(ColorKt.Color(4283385573L), 0L, 0L, 0L, $composer, (CardDefaults.$stable << 12) | 6, 14), CardDefaults.INSTANCE.m1833cardElevationaqJV_2Y(Dp.m6625constructorimpl(3), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer, (CardDefaults.$stable << 18) | 6, 62), null, f106lambda$712675347, $composer, 196614, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x039a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0228  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit lambda__712675347$lambda$12(androidx.compose.foundation.layout.ColumnScope r95, androidx.compose.runtime.Composer r96, int r97) {
        /*
            Method dump skipped, instructions count: 1310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.ComposableSingletons$HomeScreenKt.lambda__712675347$lambda$12(androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_2139349522$lambda$8(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C285@13572L428:HomeScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2139349522, $changed, -1, "com.example.ui.screens.ComposableSingletons$HomeScreenKt.lambda$2139349522.<anonymous> (HomeScreen.kt:285)");
            }
            TextKt.m2696Text4IGK_g("ALL-IN-ONE SMART SUITE ✨", PaddingKt.m674paddingVpY3zN4(Modifier.INSTANCE, Dp.m6625constructorimpl(8), Dp.m6625constructorimpl(3)), Color.INSTANCE.m4199getWhite0d7_KjU(), TextUnitKt.getSp(10), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200118, 0, 131024);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit lambda__963494529$lambda$15(androidx.compose.runtime.Composer r32, int r33) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.ComposableSingletons$HomeScreenKt.lambda__963494529$lambda$15(androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_103313418$lambda$16(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C480@23578L83,481@23690L28,482@23747L83:HomeScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(103313418, $changed, -1, "com.example.ui.screens.ComposableSingletons$HomeScreenKt.lambda$103313418.<anonymous> (HomeScreen.kt:480)");
            }
            IconKt.m2153Iconww6aTOc(StarKt.getStar(Icons.Filled.INSTANCE), (String) null, SizeKt.m718size3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(18)), 0L, $composer, 432, 8);
            SpacerKt.Spacer(SizeKt.m723width3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(8)), $composer, 6);
            TextKt.m2696Text4IGK_g("Review on Google Play Store", (Modifier) null, 0L, TextUnitKt.getSp(13), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131030);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit lambda__1200112354$lambda$18(androidx.compose.runtime.Composer r32, int r33) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.ComposableSingletons$HomeScreenKt.lambda__1200112354$lambda$18(androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__133304407$lambda$19(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C540@26663L84,541@26776L28,542@26833L69:HomeScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-133304407, $changed, -1, "com.example.ui.screens.ComposableSingletons$HomeScreenKt.lambda$-133304407.<anonymous> (HomeScreen.kt:540)");
            }
            IconKt.m2153Iconww6aTOc(ShareKt.getShare(Icons.Filled.INSTANCE), (String) null, SizeKt.m718size3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(18)), 0L, $composer, 432, 8);
            SpacerKt.Spacer(SizeKt.m723width3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(8)), $composer, 6);
            TextKt.m2696Text4IGK_g("Share App Now", (Modifier) null, 0L, TextUnitKt.getSp(13), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131030);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit lambda__1365891026$lambda$23(androidx.compose.runtime.Composer r51, int r52) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.ComposableSingletons$HomeScreenKt.lambda__1365891026$lambda$23(androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0202  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit lambda__671244019$lambda$27(androidx.compose.runtime.Composer r49, int r50) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.ComposableSingletons$HomeScreenKt.lambda__671244019$lambda$27(androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit lambda__1411711716$lambda$25(androidx.compose.runtime.Composer r32, int r33) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.ComposableSingletons$HomeScreenKt.lambda__1411711716$lambda$25(androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda_722561730$lambda$20(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C598@29252L83,599@29356L28,600@29405L59:HomeScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(722561730, $changed, -1, "com.example.ui.screens.ComposableSingletons$HomeScreenKt.lambda$722561730.<anonymous> (HomeScreen.kt:598)");
            }
            IconKt.m2153Iconww6aTOc(StarKt.getStar(Icons.Filled.INSTANCE), (String) null, SizeKt.m718size3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(16)), 0L, $composer, 432, 8);
            SpacerKt.Spacer(SizeKt.m723width3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(6)), $composer, 6);
            TextKt.m2696Text4IGK_g("Review on Google Play", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 196614, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__1106425773$lambda$21(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C605@29617L19:HomeScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1106425773, $changed, -1, "com.example.ui.screens.ComposableSingletons$HomeScreenKt.lambda$-1106425773.<anonymous> (HomeScreen.kt:605)");
            }
            TextKt.m2696Text4IGK_g("Maybe Later", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit lambda__2027168411$lambda$30(androidx.compose.runtime.Composer r51, int r52) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.ComposableSingletons$HomeScreenKt.lambda__2027168411$lambda$30(androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__399639202$lambda$31(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C640@31451L84,641@31560L28,642@31613L27:HomeScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-399639202, $changed, -1, "com.example.ui.screens.ComposableSingletons$HomeScreenKt.lambda$-399639202.<anonymous> (HomeScreen.kt:640)");
            }
            IconKt.m2153Iconww6aTOc(ShareKt.getShare(Icons.Filled.INSTANCE), (String) null, SizeKt.m718size3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(16)), 0L, $composer, 432, 8);
            SpacerKt.Spacer(SizeKt.m723width3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(6)), $composer, 6);
            TextKt.m2696Text4IGK_g("Share OmniTools App", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__720335460$lambda$32(RowScope OutlinedButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
        ComposerKt.sourceInformation($composer, "C652@32023L87,653@32135L28,654@32188L27:HomeScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-720335460, $changed, -1, "com.example.ui.screens.ComposableSingletons$HomeScreenKt.lambda$-720335460.<anonymous> (HomeScreen.kt:652)");
            }
            IconKt.m2153Iconww6aTOc(SecurityKt.getSecurity(Icons.Filled.INSTANCE), (String) null, SizeKt.m718size3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(16)), 0L, $composer, 432, 8);
            SpacerKt.Spacer(SizeKt.m723width3ABfNKs(Modifier.INSTANCE, Dp.m6625constructorimpl(6)), $composer, 6);
            TextKt.m2696Text4IGK_g("Read Privacy Policy", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__1165881844$lambda$28(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C660@32388L13:HomeScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1165881844, $changed, -1, "com.example.ui.screens.ComposableSingletons$HomeScreenKt.lambda$-1165881844.<anonymous> (HomeScreen.kt:660)");
            }
            TextKt.m2696Text4IGK_g("Close", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit lambda__2013635610$lambda$35(androidx.compose.runtime.Composer r51, int r52) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.ComposableSingletons$HomeScreenKt.lambda__2013635610$lambda$35(androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit lambda__177792763$lambda$37(androidx.compose.runtime.Composer r49, int r50) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.ui.screens.ComposableSingletons$HomeScreenKt.lambda__177792763$lambda$37(androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__1152349043$lambda$33(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C692@34401L13:HomeScreen.kt#2thlc2");
        if (($changed & 17) == 16 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1152349043, $changed, -1, "com.example.ui.screens.ComposableSingletons$HomeScreenKt.lambda$-1152349043.<anonymous> (HomeScreen.kt:692)");
            }
            TextKt.m2696Text4IGK_g("Close", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Unit lambda__1157243586$lambda$38(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C823@39191L315:HomeScreen.kt#2thlc2");
        if (($changed & 3) == 2 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1157243586, $changed, -1, "com.example.ui.screens.ComposableSingletons$HomeScreenKt.lambda$-1157243586.<anonymous> (HomeScreen.kt:823)");
            }
            TextKt.m2696Text4IGK_g("HOT 🔥", PaddingKt.m674paddingVpY3zN4(Modifier.INSTANCE, Dp.m6625constructorimpl(5), Dp.m6625constructorimpl(2)), Color.INSTANCE.m4199getWhite0d7_KjU(), TextUnitKt.getSp(8.5d), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200118, 0, 131024);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
