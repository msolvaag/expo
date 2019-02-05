package expo.modules.intentlauncher.exceptions;

import expo.core.interfaces.CodedThrowable;
import expo.errors.CodedException;

public class ActivityAlreadyStartedException extends CodedException implements CodedThrowable {
  public ActivityAlreadyStartedException() {
    super("IntentLauncher activity is already started. You need to wait for its result before starting another activity.");
  }

  @Override
  public String getCode() {
    return "E_ACTIVITY_ALREADY_STARTED";
  }
}
