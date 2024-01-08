import unittest

from flask import json

from openapi_server.models.bulk_custom_field_option_create_request import BulkCustomFieldOptionCreateRequest  # noqa: E501
from openapi_server.models.bulk_custom_field_option_update_request import BulkCustomFieldOptionUpdateRequest  # noqa: E501
from openapi_server.models.custom_field_created_context_options_list import CustomFieldCreatedContextOptionsList  # noqa: E501
from openapi_server.models.custom_field_option import CustomFieldOption  # noqa: E501
from openapi_server.models.custom_field_updated_context_options_list import CustomFieldUpdatedContextOptionsList  # noqa: E501
from openapi_server.models.order_of_custom_field_options import OrderOfCustomFieldOptions  # noqa: E501
from openapi_server.models.page_bean_custom_field_context_option import PageBeanCustomFieldContextOption  # noqa: E501
from openapi_server.test import BaseTestCase


class TestIssueCustomFieldOptionsController(BaseTestCase):
    """IssueCustomFieldOptionsController integration test stubs"""

    def test_create_custom_field_option(self):
        """Test case for create_custom_field_option

        Create custom field options (context)
        """
        bulk_custom_field_option_create_request = {"options":[{"disabled":True,"optionId":"optionId","value":"value"},{"disabled":True,"optionId":"optionId","value":"value"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/field/{field_id}/context/{context_id}/option'.format(field_id='field_id_example', context_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(bulk_custom_field_option_create_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_custom_field_option(self):
        """Test case for delete_custom_field_option

        Delete custom field options (context)
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/field/{field_id}/context/{context_id}/option/{option_id}'.format(field_id='field_id_example', context_id=56, option_id=56),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_custom_field_option(self):
        """Test case for get_custom_field_option

        Get custom field option
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/customFieldOption/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_options_for_context(self):
        """Test case for get_options_for_context

        Get custom field options (context)
        """
        query_string = [('optionId', 56),
                        ('onlyOptions', False),
                        ('startAt', 0),
                        ('maxResults', 100)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/field/{field_id}/context/{context_id}/option'.format(field_id='field_id_example', context_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_reorder_custom_field_options(self):
        """Test case for reorder_custom_field_options

        Reorder custom field options (context)
        """
        order_of_custom_field_options = {"after":"after","position":"First","customFieldOptionIds":["customFieldOptionIds","customFieldOptionIds"]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/field/{field_id}/context/{context_id}/option/move'.format(field_id='field_id_example', context_id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(order_of_custom_field_options),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_custom_field_option(self):
        """Test case for update_custom_field_option

        Update custom field options (context)
        """
        bulk_custom_field_option_update_request = {"options":[{"disabled":True,"id":"id","value":"value"},{"disabled":True,"id":"id","value":"value"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/field/{field_id}/context/{context_id}/option'.format(field_id='field_id_example', context_id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(bulk_custom_field_option_update_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
