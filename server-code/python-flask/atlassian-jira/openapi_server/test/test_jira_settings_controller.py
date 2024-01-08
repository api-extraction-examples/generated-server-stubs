import unittest

from flask import json

from openapi_server.models.application_property import ApplicationProperty  # noqa: E501
from openapi_server.models.configuration import Configuration  # noqa: E501
from openapi_server.models.simple_application_property_bean import SimpleApplicationPropertyBean  # noqa: E501
from openapi_server.test import BaseTestCase


class TestJiraSettingsController(BaseTestCase):
    """JiraSettingsController integration test stubs"""

    def test_get_advanced_settings(self):
        """Test case for get_advanced_settings

        Get advanced settings
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/application-properties/advanced-settings',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_application_property(self):
        """Test case for get_application_property

        Get application property
        """
        query_string = [('key', 'key_example'),
                        ('permissionLevel', 'permission_level_example'),
                        ('keyFilter', 'key_filter_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/application-properties',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_configuration(self):
        """Test case for get_configuration

        Get global settings
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/configuration',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_set_application_property(self):
        """Test case for set_application_property

        Set application property
        """
        simple_application_property_bean = {"id":"id","value":"value"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/application-properties/{id}'.format(id='id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(simple_application_property_bean),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
