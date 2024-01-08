import unittest

from flask import json

from openapi_server.models.connect_modules import ConnectModules  # noqa: E501
from openapi_server.models.error_message import ErrorMessage  # noqa: E501
from openapi_server.test import BaseTestCase


class TestDynamicModulesController(BaseTestCase):
    """DynamicModulesController integration test stubs"""

    def test_dynamic_modules_resource_get_modules_get(self):
        """Test case for dynamic_modules_resource_get_modules_get

        Get modules
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/rest/atlassian-connect/1/app/module/dynamic',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_dynamic_modules_resource_register_modules_post(self):
        """Test case for dynamic_modules_resource_register_modules_post

        Register modules
        """
        connect_modules = {"jiraEntityProperties":[{"entityType":"issue","key":"dynamic-attachment-entity-property","keyConfigurations":[{"extractions":[{"alias":"attachmentExtension","objectName":"extension","type":"text"}],"propertyKey":"attachment"}],"name":{"value":"Attachment Index Document"}}],"jiraIssueFields":[{"description":{"value":"A dynamically added single-select field"},"extractions":[{"name":"categoryName","path":"category","type":"text"}],"key":"dynamic-select-field","name":{"value":"Dynamic single select"},"type":"single_select"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/rest/atlassian-connect/1/app/module/dynamic',
            method='POST',
            headers=headers,
            data=json.dumps(connect_modules),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_dynamic_modules_resource_remove_modules_delete(self):
        """Test case for dynamic_modules_resource_remove_modules_delete

        Remove modules
        """
        query_string = [('moduleKey', ['module_key_example'])]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/rest/atlassian-connect/1/app/module/dynamic',
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
