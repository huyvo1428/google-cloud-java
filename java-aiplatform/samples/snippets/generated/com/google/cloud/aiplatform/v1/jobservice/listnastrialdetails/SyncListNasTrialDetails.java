/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.aiplatform.v1.samples;

// [START aiplatform_v1_generated_JobService_ListNasTrialDetails_sync]
import com.google.cloud.aiplatform.v1.JobServiceClient;
import com.google.cloud.aiplatform.v1.ListNasTrialDetailsRequest;
import com.google.cloud.aiplatform.v1.NasJobName;
import com.google.cloud.aiplatform.v1.NasTrialDetail;

public class SyncListNasTrialDetails {

  public static void main(String[] args) throws Exception {
    syncListNasTrialDetails();
  }

  public static void syncListNasTrialDetails() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
      ListNasTrialDetailsRequest request =
          ListNasTrialDetailsRequest.newBuilder()
              .setParent(NasJobName.of("[PROJECT]", "[LOCATION]", "[NAS_JOB]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      for (NasTrialDetail element : jobServiceClient.listNasTrialDetails(request).iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END aiplatform_v1_generated_JobService_ListNasTrialDetails_sync]
