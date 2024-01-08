import unittest

from flask import json

from openapi_server.models.return_policy import ReturnPolicy  # noqa: E501
from openapi_server.models.return_policy_request import ReturnPolicyRequest  # noqa: E501
from openapi_server.models.return_policy_response import ReturnPolicyResponse  # noqa: E501
from openapi_server.models.set_return_policy_response import SetReturnPolicyResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestReturnPolicyController(BaseTestCase):
    """ReturnPolicyController integration test stubs"""

    def test_create_return_policy(self):
        """Test case for create_return_policy

        
        """
        return_policy_request = {"returnShippingCostPayer":"returnShippingCostPayer","categoryTypes":[{"default":True,"name":"name"},{"default":True,"name":"name"}],"refundMethod":"refundMethod","description":"description","restockingFeePercentage":"restockingFeePercentage","returnInstructions":"returnInstructions","returnPeriod":{"unit":"unit","value":0},"marketplaceId":"marketplaceId","internationalOverride":{"returnShippingCostPayer":"returnShippingCostPayer","returnMethod":"returnMethod","returnsAccepted":True,"returnPeriod":{"unit":"unit","value":0}},"returnMethod":"returnMethod","name":"name","returnsAccepted":True,"extendedHolidayReturnsOffered":True}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/sell/account/v1/return_policy',
            method='POST',
            headers=headers,
            data=json.dumps(return_policy_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_return_policy(self):
        """Test case for delete_return_policy

        
        """
        headers = { 
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/sell/account/v1/return_policy/{return_policy_id}'.format(return_policy_id='return_policy_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_return_policies(self):
        """Test case for get_return_policies

        
        """
        query_string = [('marketplace_id', 'marketplace_id_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/sell/account/v1/return_policy',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_return_policy(self):
        """Test case for get_return_policy

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/sell/account/v1/return_policy/{return_policy_id}'.format(return_policy_id='return_policy_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_return_policy_by_name(self):
        """Test case for get_return_policy_by_name

        
        """
        query_string = [('marketplace_id', 'marketplace_id_example'),
                        ('name', 'name_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/sell/account/v1/return_policy/get_by_policy_name',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_return_policy(self):
        """Test case for update_return_policy

        
        """
        return_policy_request = {"returnShippingCostPayer":"returnShippingCostPayer","categoryTypes":[{"default":True,"name":"name"},{"default":True,"name":"name"}],"refundMethod":"refundMethod","description":"description","restockingFeePercentage":"restockingFeePercentage","returnInstructions":"returnInstructions","returnPeriod":{"unit":"unit","value":0},"marketplaceId":"marketplaceId","internationalOverride":{"returnShippingCostPayer":"returnShippingCostPayer","returnMethod":"returnMethod","returnsAccepted":True,"returnPeriod":{"unit":"unit","value":0}},"returnMethod":"returnMethod","name":"name","returnsAccepted":True,"extendedHolidayReturnsOffered":True}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/sell/account/v1/return_policy/{return_policy_id}'.format(return_policy_id='return_policy_id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(return_policy_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
