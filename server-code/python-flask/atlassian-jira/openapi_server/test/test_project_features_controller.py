import unittest

from flask import json

from openapi_server.models.container_for_project_features import ContainerForProjectFeatures  # noqa: E501
from openapi_server.models.project_feature_state import ProjectFeatureState  # noqa: E501
from openapi_server.test import BaseTestCase


class TestProjectFeaturesController(BaseTestCase):
    """ProjectFeaturesController integration test stubs"""

    def test_get_features_for_project(self):
        """Test case for get_features_for_project

        Get project features
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/project/{project_id_or_key}/features'.format(project_id_or_key='project_id_or_key_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_toggle_feature_for_project(self):
        """Test case for toggle_feature_for_project

        Set project feature state
        """
        project_feature_state = {"state":"ENABLED"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/project/{project_id_or_key}/features/{feature_key}'.format(project_id_or_key='project_id_or_key_example', feature_key='feature_key_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(project_feature_state),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
