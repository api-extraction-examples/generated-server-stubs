import unittest

from flask import json

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.post_payments_cross_border_credit_transfers_ok_body import PostPaymentsCrossBorderCreditTransfersOKBody  # noqa: E501
from openapi_server.models.post_payments_cross_border_credit_transfers_params_body import PostPaymentsCrossBorderCreditTransfersParamsBody  # noqa: E501
from openapi_server.test import BaseTestCase


class TestCrossBorderPaymentsController(BaseTestCase):
    """CrossBorderPaymentsController integration test stubs"""

    def test_payments_cross_border_credit_transfers_post(self):
        """Test case for payments_cross_border_credit_transfers_post

        Redeem the payment
        """
        body = openapi_server.PostPaymentsCrossBorderCreditTransfersParamsBody()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/openbanking/sandbox/connect/api/payments/cross-border-credit-transfers',
            method='POST',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
