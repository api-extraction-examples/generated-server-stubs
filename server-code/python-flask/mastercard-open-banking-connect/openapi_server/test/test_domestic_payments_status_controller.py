import unittest

from flask import json

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.post_payments_domestic_credit_transfers_payment_status_ok_body import PostPaymentsDomesticCreditTransfersPaymentStatusOKBody  # noqa: E501
from openapi_server.models.post_payments_domestic_credit_transfers_payment_status_params_body import PostPaymentsDomesticCreditTransfersPaymentStatusParamsBody  # noqa: E501
from openapi_server.test import BaseTestCase


class TestDomesticPaymentsStatusController(BaseTestCase):
    """DomesticPaymentsStatusController integration test stubs"""

    def test_payments_domestic_credit_transfers_payment_status_post(self):
        """Test case for payments_domestic_credit_transfers_payment_status_post

        Get payment status
        """
        body = openapi_server.PostPaymentsDomesticCreditTransfersPaymentStatusParamsBody()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        }
        response = self.client.open(
            '/openbanking/sandbox/connect/api/payments/domestic-credit-transfers/payment-status',
            method='POST',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
