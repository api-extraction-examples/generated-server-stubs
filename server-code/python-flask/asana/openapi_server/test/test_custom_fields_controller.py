import unittest

from flask import json

from openapi_server.models.create_custom_field201_response import CreateCustomField201Response  # noqa: E501
from openapi_server.models.create_custom_field_request import CreateCustomFieldRequest  # noqa: E501
from openapi_server.models.create_enum_option_for_custom_field201_response import CreateEnumOptionForCustomField201Response  # noqa: E501
from openapi_server.models.create_enum_option_for_custom_field_request import CreateEnumOptionForCustomFieldRequest  # noqa: E501
from openapi_server.models.delete_attachment200_response import DeleteAttachment200Response  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.get_custom_fields_for_workspace200_response import GetCustomFieldsForWorkspace200Response  # noqa: E501
from openapi_server.models.insert_enum_option_for_custom_field_request import InsertEnumOptionForCustomFieldRequest  # noqa: E501
from openapi_server.test import BaseTestCase


class TestCustomFieldsController(BaseTestCase):
    """CustomFieldsController integration test stubs"""

    def test_create_custom_field(self):
        """Test case for create_custom_field

        Create a custom field
        """
        create_custom_field_request = openapi_server.CreateCustomFieldRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]']),
                        ('limit', 50),
                        ('offset', 'eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/custom_fields',
            method='POST',
            headers=headers,
            data=json.dumps(create_custom_field_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_enum_option_for_custom_field(self):
        """Test case for create_enum_option_for_custom_field

        Create an enum option
        """
        create_enum_option_for_custom_field_request = openapi_server.CreateEnumOptionForCustomFieldRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]']),
                        ('limit', 50),
                        ('offset', 'eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/custom_fields/{custom_field_gid}/enum_options'.format(custom_field_gid='12345'),
            method='POST',
            headers=headers,
            data=json.dumps(create_enum_option_for_custom_field_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_custom_field(self):
        """Test case for delete_custom_field

        Delete a custom field
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/custom_fields/{custom_field_gid}'.format(custom_field_gid='12345'),
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_custom_field(self):
        """Test case for get_custom_field

        Get a custom field
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/custom_fields/{custom_field_gid}'.format(custom_field_gid='12345'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_custom_fields_for_workspace(self):
        """Test case for get_custom_fields_for_workspace

        Get a workspace's custom fields
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]']),
                        ('limit', 50),
                        ('offset', 'eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/workspaces/{workspace_gid}/custom_fields'.format(workspace_gid='12345'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_insert_enum_option_for_custom_field(self):
        """Test case for insert_enum_option_for_custom_field

        Reorder a custom field's enum
        """
        insert_enum_option_for_custom_field_request = openapi_server.InsertEnumOptionForCustomFieldRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/custom_fields/{custom_field_gid}/enum_options/insert'.format(custom_field_gid='12345'),
            method='POST',
            headers=headers,
            data=json.dumps(insert_enum_option_for_custom_field_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_custom_field(self):
        """Test case for update_custom_field

        Update a custom field
        """
        create_custom_field_request = openapi_server.CreateCustomFieldRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/custom_fields/{custom_field_gid}'.format(custom_field_gid='12345'),
            method='PUT',
            headers=headers,
            data=json.dumps(create_custom_field_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_enum_option(self):
        """Test case for update_enum_option

        Update an enum option
        """
        create_enum_option_for_custom_field_request = openapi_server.CreateEnumOptionForCustomFieldRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/enum_options/{enum_option_gid}'.format(enum_option_gid='124578'),
            method='PUT',
            headers=headers,
            data=json.dumps(create_enum_option_for_custom_field_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
