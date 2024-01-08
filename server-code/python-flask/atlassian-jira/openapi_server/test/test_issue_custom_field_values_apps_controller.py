import unittest

from flask import json

from openapi_server.models.custom_field_value_update_details import CustomFieldValueUpdateDetails  # noqa: E501
from openapi_server.models.multiple_custom_field_values_update_details import MultipleCustomFieldValuesUpdateDetails  # noqa: E501
from openapi_server.test import BaseTestCase


class TestIssueCustomFieldValuesAppsController(BaseTestCase):
    """IssueCustomFieldValuesAppsController integration test stubs"""

    def test_update_custom_field_value(self):
        """Test case for update_custom_field_value

        Update custom field value
        """
        custom_field_value_update_details = {"updates":[{"issueIds":[0,0],"value":""},{"issueIds":[0,0],"value":""}]}
        query_string = [('generateChangelog', True)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/app/field/{field_id_or_key}/value'.format(field_id_or_key='field_id_or_key_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(custom_field_value_update_details),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_multiple_custom_field_values(self):
        """Test case for update_multiple_custom_field_values

        Update custom fields
        """
        multiple_custom_field_values_update_details = {"updates":[{"issueIds":[0,0],"value":"","customField":"customField"},{"issueIds":[0,0],"value":"","customField":"customField"}]}
        query_string = [('generateChangelog', True)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/app/field/value',
            method='POST',
            headers=headers,
            data=json.dumps(multiple_custom_field_values_update_details),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
