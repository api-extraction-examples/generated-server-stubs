import unittest

from flask import json

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.post_payments_domestic_credit_transfers_ok_body import PostPaymentsDomesticCreditTransfersOKBody  # noqa: E501
from openapi_server.models.post_payments_domestic_credit_transfers_params_body import PostPaymentsDomesticCreditTransfersParamsBody  # noqa: E501
from openapi_server.test import BaseTestCase


class TestDomesticPaymentsController(BaseTestCase):
    """DomesticPaymentsController integration test stubs"""

    def test_payments_domestic_credit_transfers_post(self):
        """Test case for payments_domestic_credit_transfers_post

        Redeem the payment
        """
        body = openapi_server.PostPaymentsDomesticCreditTransfersParamsBody()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/openbanking/sandbox/connect/api/payments/domestic-credit-transfers',
            method='POST',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
