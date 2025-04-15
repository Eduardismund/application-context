package com.github.eduardismund.appctx;

/**
 * Listener for the BeforeRun application context event.
 */
public interface BeforeRunListener {

    /**
     * Method called before the application context run phase.
     *
     * @param componentResolver resolver for component registered in application context.
     */
    void beforeRun(ComponentResolver componentResolver);
}
