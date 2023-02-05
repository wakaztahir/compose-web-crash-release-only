import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composition
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.*
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.window.Window
import com.wakaztahir.sketchapp.screens.EditorScreen
import com.wakaztahir.sketchapp.ui.theme.SketchableTheme
import org.jetbrains.compose.web.renderComposable
import org.jetbrains.compose.web.renderComposableInBody
//import com.wakaztahir.sketchapp.screens.EditorScreen
import org.jetbrains.skiko.wasm.onWasmReady

fun main() {
    onWasmReady {

        //TODO This one crashes in release mode only
        /**
         * Uncaught TypeError: i.k1d is not a function
         *     at Je.s1i (Trace.kt:53:41608)
         *     at Ge (Composition.kt:832:25)
         *     at Qe.o1j (Standard.kt:158:28739)
         *     at ms.t1d (Recomposer.kt:978:25)
         *     at Ao.t1d (Composer.kt:3848:27)
         *     at Qe.y1j (Composition.kt:519:16)
         *     at hc (SubcomposeLayout.kt:468:17)
         *     at vc (SubcomposeLayout.kt:432:13)
         *     at dc.e4k (SubcomposeLayout.kt:421:9)
         *     at cc.e4k (SubcomposeLayout.kt:733:49)
         *
         *"p_: layout state is not idle before measure starts
         *     at Up (http://localhost:63342/CrashTheWeb/CrashTheWeb.web/build/distributions/web.js:1:766995)
         *     at Fp.y4z (http://localhost:63342/CrashTheWeb/CrashTheWeb.web/build/distributions/web.js:1:903061)
         *     at bp.b50 (http://localhost:63342/CrashTheWeb/CrashTheWeb.web/build/distributions/web.js:1:895980)
         *     at http://localhost:63342/CrashTheWeb/CrashTheWeb.web/build/distributions/web.js:1:770535
         *     at nd (http://localhost:63342/CrashTheWeb/CrashTheWeb.web/build/distributions/web.js:1:770674)
         *     at ed.h53 (http://localhost:63342/CrashTheWeb/CrashTheWeb.web/build/distributions/web.js:1:915273)
         *     at ub.d56 (http://localhost:63342/CrashTheWeb/CrashTheWeb.web/build/distributions/web.js:1:952404)
         *     at ub.e56 (http://localhost:63342/CrashTheWeb/CrashTheWeb.web/build/distributions/web.js:1:960431)
         *     at nm.c5o (http://localhost:63342/CrashTheWeb/CrashTheWeb.web/build/distributions/web.js:1:941636)
         *     at Rw.d2r (http://localhost:63342/CrashTheWeb/CrashTheWeb.web/build/distributions/web.js:1:938733)"
         */
//        BrowserViewportWindow("Sketchable") {
//            SketchableTheme {
//                Box(modifier = Modifier.fillMaxSize()) {
//                    EditorScreen(
//                        onBack = {
//                            //do nothing
//                        }
//                    )
//                }
//            }
//        }

        /**
         * TODO This also crashes in release , its the same error
         * Uncaught TypeError: i.k1d is not a function
         *     at Je.s1i (Trace.kt:53:41608)
         *     at He (Composition.kt:832:25)
         *     at Qe.o1j (Standard.kt:158:28739)
         *     at ms.t1d (Recomposer.kt:978:25)
         *     at Ao.t1d (Composer.kt:3848:27)
         *     at Qe.y1j (Composition.kt:519:16)
         *     at ac (SubcomposeLayout.kt:468:17)
         *     at pc (SubcomposeLayout.kt:432:13)
         *     at yc.e4k (SubcomposeLayout.kt:421:9)
         *     at vc.e4k (SubcomposeLayout.kt:733:49)
         */
        Window {
            SketchableTheme {
                Box(modifier = Modifier.fillMaxSize()) {
                    EditorScreen(
                        onBack = {
                            //do nothing
                        }
                    )
                }
            }
        }

    }
}


