import unittest

from flask import json

from openapi_server.models.custom_policy import CustomPolicy  # noqa: E501
from openapi_server.models.custom_policy_create_request import CustomPolicyCreateRequest  # noqa: E501
from openapi_server.models.custom_policy_request import CustomPolicyRequest  # noqa: E501
from openapi_server.models.custom_policy_response import CustomPolicyResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestCustomPolicyController(BaseTestCase):
    """CustomPolicyController integration test stubs"""

    def test_create_custom_policy(self):
        """Test case for create_custom_policy

        
        """
        custom_policy_create_request = {"policyType":"policyType","name":"name","description":"description","label":"label"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'x_ebay_c_marketplace_id': 'x_ebay_c_marketplace_id_example',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/sell/account/v1/custom_policy/',
            method='POST',
            headers=headers,
            data=json.dumps(custom_policy_create_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_custom_policies(self):
        """Test case for get_custom_policies

        
        """
        query_string = [('policy_types', 'policy_types_example')]
        headers = { 
            'Accept': 'application/json',
            'x_ebay_c_marketplace_id': 'x_ebay_c_marketplace_id_example',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/sell/account/v1/custom_policy/',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_custom_policy(self):
        """Test case for get_custom_policy

        
        """
        headers = { 
            'Accept': 'application/json',
            'x_ebay_c_marketplace_id': 'x_ebay_c_marketplace_id_example',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/sell/account/v1/custom_policy/{custom_policy_id}'.format(custom_policy_id='custom_policy_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_custom_policy(self):
        """Test case for update_custom_policy

        
        """
        custom_policy_request = {"name":"name","description":"description","label":"label"}
        headers = { 
            'Content-Type': 'application/json',
            'x_ebay_c_marketplace_id': 'x_ebay_c_marketplace_id_example',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/sell/account/v1/custom_policy/{custom_policy_id}'.format(custom_policy_id='custom_policy_id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(custom_policy_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
