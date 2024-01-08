import unittest

from flask import json

from openapi_server.models.entity_property import EntityProperty  # noqa: E501
from openapi_server.models.property_keys import PropertyKeys  # noqa: E501
from openapi_server.test import BaseTestCase


class TestProjectPropertiesController(BaseTestCase):
    """ProjectPropertiesController integration test stubs"""

    def test_delete_project_property(self):
        """Test case for delete_project_property

        Delete project property
        """
        headers = { 
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/project/{project_id_or_key}/properties/{property_key}'.format(project_id_or_key='project_id_or_key_example', property_key='property_key_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_project_property(self):
        """Test case for get_project_property

        Get project property
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/project/{project_id_or_key}/properties/{property_key}'.format(project_id_or_key='project_id_or_key_example', property_key='property_key_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_project_property_keys(self):
        """Test case for get_project_property_keys

        Get project property keys
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/project/{project_id_or_key}/properties'.format(project_id_or_key='project_id_or_key_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_set_project_property(self):
        """Test case for set_project_property

        Set project property
        """
        body = {"number":5,"string":"string-value"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/project/{project_id_or_key}/properties/{property_key}'.format(project_id_or_key='project_id_or_key_example', property_key='property_key_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
