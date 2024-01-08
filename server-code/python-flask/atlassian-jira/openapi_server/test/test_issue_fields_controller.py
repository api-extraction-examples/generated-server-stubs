import unittest

from flask import json

from openapi_server.models.custom_field_definition_json_bean import CustomFieldDefinitionJsonBean  # noqa: E501
from openapi_server.models.error_collection import ErrorCollection  # noqa: E501
from openapi_server.models.field_details import FieldDetails  # noqa: E501
from openapi_server.models.page_bean_context import PageBeanContext  # noqa: E501
from openapi_server.models.page_bean_field import PageBeanField  # noqa: E501
from openapi_server.models.task_progress_bean_object import TaskProgressBeanObject  # noqa: E501
from openapi_server.models.update_custom_field_details import UpdateCustomFieldDetails  # noqa: E501
from openapi_server.test import BaseTestCase


class TestIssueFieldsController(BaseTestCase):
    """IssueFieldsController integration test stubs"""

    def test_create_custom_field(self):
        """Test case for create_custom_field

        Create custom field
        """
        custom_field_definition_json_bean = {"searcherKey":"com.atlassian.jira.plugin.system.customfieldtypes:cascadingselectsearcher","name":"name","description":"description","type":"type"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/field',
            method='POST',
            headers=headers,
            data=json.dumps(custom_field_definition_json_bean),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_custom_field(self):
        """Test case for delete_custom_field

        Delete custom field
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/field/{id}'.format(id='id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_contexts_for_field_deprecated(self):
        """Test case for get_contexts_for_field_deprecated

        Get contexts for a field
        """
        query_string = [('startAt', 0),
                        ('maxResults', 20)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/field/{field_id}/contexts'.format(field_id='field_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_fields(self):
        """Test case for get_fields

        Get fields
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/field',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_fields_paginated(self):
        """Test case for get_fields_paginated

        Get fields paginated
        """
        query_string = [('startAt', 0),
                        ('maxResults', 50),
                        ('type', ['type_example']),
                        ('id', ['id_example']),
                        ('query', 'query_example'),
                        ('orderBy', 'order_by_example'),
                        ('expand', 'expand_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/field/search',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_trashed_fields_paginated(self):
        """Test case for get_trashed_fields_paginated

        Get fields in trash paginated
        """
        query_string = [('startAt', 0),
                        ('maxResults', 50),
                        ('id', ['id_example']),
                        ('query', 'query_example'),
                        ('expand', 'expand_example'),
                        ('orderBy', 'order_by_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/field/search/trashed',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_restore_custom_field(self):
        """Test case for restore_custom_field

        Restore custom field from trash
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/field/{id}/restore'.format(id='id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_trash_custom_field(self):
        """Test case for trash_custom_field

        Move custom field to trash
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/field/{id}/trash'.format(id='id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_custom_field(self):
        """Test case for update_custom_field

        Update custom field
        """
        update_custom_field_details = {"searcherKey":"com.atlassian.jira.plugin.system.customfieldtypes:cascadingselectsearcher","name":"name","description":"description"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/field/{field_id}'.format(field_id='field_id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(update_custom_field_details),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
