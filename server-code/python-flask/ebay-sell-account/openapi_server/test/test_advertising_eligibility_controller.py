import unittest

from flask import json

from openapi_server.models.seller_eligibility_multi_program_response import SellerEligibilityMultiProgramResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAdvertisingEligibilityController(BaseTestCase):
    """AdvertisingEligibilityController integration test stubs"""

    def test_get_advertising_eligibility(self):
        """Test case for get_advertising_eligibility

        
        """
        query_string = [('program_types', 'program_types_example')]
        headers = { 
            'Accept': 'application/json',
            'x_ebay_c_marketplace_id': 'x_ebay_c_marketplace_id_example',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/sell/account/v1/advertising_eligibility',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
