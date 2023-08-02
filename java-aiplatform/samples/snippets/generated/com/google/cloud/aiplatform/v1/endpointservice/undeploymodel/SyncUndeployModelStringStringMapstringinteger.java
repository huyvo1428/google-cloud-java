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

// [START aiplatform_v1_generated_EndpointService_UndeployModel_StringStringMapstringinteger_sync]
import com.google.cloud.aiplatform.v1.EndpointName;
import com.google.cloud.aiplatform.v1.EndpointServiceClient;
import com.google.cloud.aiplatform.v1.UndeployModelResponse;
import java.util.HashMap;
import java.util.Map;

public class SyncUndeployModelStringStringMapstringinteger {

  public static void main(String[] args) throws Exception {
    syncUndeployModelStringStringMapstringinteger();
  }

  public static void syncUndeployModelStringStringMapstringinteger() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (EndpointServiceClient endpointServiceClient = EndpointServiceClient.create()) {
      String endpoint =
          EndpointName.ofProjectLocationEndpointName("[PROJECT]", "[LOCATION]", "[ENDPOINT]")
              .toString();
      String deployedModelId = "deployedModelId-1817547906";
      Map<String, Integer> trafficSplit = new HashMap<>();
      UndeployModelResponse response =
          endpointServiceClient.undeployModelAsync(endpoint, deployedModelId, trafficSplit).get();
    }
  }
}
// [END aiplatform_v1_generated_EndpointService_UndeployModel_StringStringMapstringinteger_sync]
