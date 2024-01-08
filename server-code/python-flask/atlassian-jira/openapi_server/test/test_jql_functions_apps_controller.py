import unittest

from flask import json

from openapi_server.models.jql_function_precomputation_update_request_bean import JqlFunctionPrecomputationUpdateRequestBean  # noqa: E501
from openapi_server.models.page_bean_jql_function_precomputation_bean import PageBeanJqlFunctionPrecomputationBean  # noqa: E501
from openapi_server.test import BaseTestCase


class TestJQLFunctionsAppsController(BaseTestCase):
    """JQLFunctionsAppsController integration test stubs"""

    def test_get_precomputations(self):
        """Test case for get_precomputations

        Get precomputations (apps)
        """
        query_string = [('functionKey', ['function_key_example']),
                        ('startAt', 0),
                        ('maxResults', 100),
                        ('orderBy', 'order_by_example'),
                        ('filter', 'filter_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/jql/function/computation',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_precomputations(self):
        """Test case for update_precomputations

        Update precomputations (apps)
        """
        jql_function_precomputation_update_request_bean = {"values":[{"id":0,"value":"value"},{"id":0,"value":"value"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/jql/function/computation',
            method='POST',
            headers=headers,
            data=json.dumps(jql_function_precomputation_update_request_bean),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
