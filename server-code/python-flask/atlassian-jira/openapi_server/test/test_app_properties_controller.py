import unittest

from flask import json

from openapi_server.models.entity_property import EntityProperty  # noqa: E501
from openapi_server.models.operation_message import OperationMessage  # noqa: E501
from openapi_server.models.property_keys import PropertyKeys  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAppPropertiesController(BaseTestCase):
    """AppPropertiesController integration test stubs"""

    def test_addon_properties_resource_delete_addon_property_delete(self):
        """Test case for addon_properties_resource_delete_addon_property_delete

        Delete app property
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/rest/atlassian-connect/1/addons/{addon_key}/properties/{property_key}'.format(addon_key='addon_key_example', property_key='property_key_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_addon_properties_resource_get_addon_properties_get(self):
        """Test case for addon_properties_resource_get_addon_properties_get

        Get app properties
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/atlassian-connect/1/addons/{addon_key}/properties'.format(addon_key='addon_key_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_addon_properties_resource_get_addon_property_get(self):
        """Test case for addon_properties_resource_get_addon_property_get

        Get app property
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/atlassian-connect/1/addons/{addon_key}/properties/{property_key}'.format(addon_key='addon_key_example', property_key='property_key_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_addon_properties_resource_put_addon_property_put(self):
        """Test case for addon_properties_resource_put_addon_property_put

        Set app property
        """
        body = None
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/rest/atlassian-connect/1/addons/{addon_key}/properties/{property_key}'.format(addon_key='addon_key_example', property_key='property_key_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
