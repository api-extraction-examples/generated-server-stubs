import unittest

from flask import json

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.post_payments_sepa_credit_transfers_ok_body import PostPaymentsSepaCreditTransfersOKBody  # noqa: E501
from openapi_server.models.post_payments_sepa_credit_transfers_params_body import PostPaymentsSepaCreditTransfersParamsBody  # noqa: E501
from openapi_server.test import BaseTestCase


class TestSEPAPaymentsController(BaseTestCase):
    """SEPAPaymentsController integration test stubs"""

    def test_payments_sepa_credit_transfers_post(self):
        """Test case for payments_sepa_credit_transfers_post

        Redeem the payment
        """
        body = openapi_server.PostPaymentsSepaCreditTransfersParamsBody()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/openbanking/sandbox/connect/api/payments/sepa-credit-transfers',
            method='POST',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
