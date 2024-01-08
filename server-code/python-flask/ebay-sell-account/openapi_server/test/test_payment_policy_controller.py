import unittest

from flask import json

from openapi_server.models.payment_policy import PaymentPolicy  # noqa: E501
from openapi_server.models.payment_policy_request import PaymentPolicyRequest  # noqa: E501
from openapi_server.models.payment_policy_response import PaymentPolicyResponse  # noqa: E501
from openapi_server.models.set_payment_policy_response import SetPaymentPolicyResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestPaymentPolicyController(BaseTestCase):
    """PaymentPolicyController integration test stubs"""

    def test_create_payment_policy(self):
        """Test case for create_payment_policy

        
        """
        payment_policy_request = {"marketplaceId":"marketplaceId","categoryTypes":[{"default":True,"name":"name"},{"default":True,"name":"name"}],"paymentMethods":[{"recipientAccountReference":{"referenceType":"referenceType","referenceId":"referenceId"},"brands":["brands","brands"],"paymentMethodType":"paymentMethodType"},{"recipientAccountReference":{"referenceType":"referenceType","referenceId":"referenceId"},"brands":["brands","brands"],"paymentMethodType":"paymentMethodType"}],"name":"name","paymentInstructions":"paymentInstructions","deposit":{"amount":{"currency":"currency","value":"value"},"paymentMethods":[{"recipientAccountReference":{"referenceType":"referenceType","referenceId":"referenceId"},"brands":["brands","brands"],"paymentMethodType":"paymentMethodType"},{"recipientAccountReference":{"referenceType":"referenceType","referenceId":"referenceId"},"brands":["brands","brands"],"paymentMethodType":"paymentMethodType"}],"dueIn":{"unit":"unit","value":0}},"description":"description","immediatePay":True,"fullPaymentDueIn":{"unit":"unit","value":0}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/sell/account/v1/payment_policy',
            method='POST',
            headers=headers,
            data=json.dumps(payment_policy_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_payment_policy(self):
        """Test case for delete_payment_policy

        
        """
        headers = { 
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/sell/account/v1/payment_policy/{payment_policy_id}'.format(payment_policy_id='payment_policy_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_payment_policies(self):
        """Test case for get_payment_policies

        
        """
        query_string = [('marketplace_id', 'marketplace_id_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/sell/account/v1/payment_policy',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_payment_policy(self):
        """Test case for get_payment_policy

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/sell/account/v1/payment_policy/{payment_policy_id}'.format(payment_policy_id='payment_policy_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_payment_policy_by_name(self):
        """Test case for get_payment_policy_by_name

        
        """
        query_string = [('marketplace_id', 'marketplace_id_example'),
                        ('name', 'name_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/sell/account/v1/payment_policy/get_by_policy_name',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_payment_policy(self):
        """Test case for update_payment_policy

        
        """
        payment_policy_request = {"marketplaceId":"marketplaceId","categoryTypes":[{"default":True,"name":"name"},{"default":True,"name":"name"}],"paymentMethods":[{"recipientAccountReference":{"referenceType":"referenceType","referenceId":"referenceId"},"brands":["brands","brands"],"paymentMethodType":"paymentMethodType"},{"recipientAccountReference":{"referenceType":"referenceType","referenceId":"referenceId"},"brands":["brands","brands"],"paymentMethodType":"paymentMethodType"}],"name":"name","paymentInstructions":"paymentInstructions","deposit":{"amount":{"currency":"currency","value":"value"},"paymentMethods":[{"recipientAccountReference":{"referenceType":"referenceType","referenceId":"referenceId"},"brands":["brands","brands"],"paymentMethodType":"paymentMethodType"},{"recipientAccountReference":{"referenceType":"referenceType","referenceId":"referenceId"},"brands":["brands","brands"],"paymentMethodType":"paymentMethodType"}],"dueIn":{"unit":"unit","value":0}},"description":"description","immediatePay":True,"fullPaymentDueIn":{"unit":"unit","value":0}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/sell/account/v1/payment_policy/{payment_policy_id}'.format(payment_policy_id='payment_policy_id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(payment_policy_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
