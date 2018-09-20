package isfaaghyth.app.fotballclub.utils.test

import io.reactivex.Scheduler

/**
 * Created by isfaaghyth on 9/20/18.
 * github: @isfaaghyth
 */
interface SchedulerProvider {
    fun ui(): Scheduler
    fun computation(): Scheduler
    fun trampoline(): Scheduler
    fun newThread(): Scheduler
    fun io(): Scheduler
}