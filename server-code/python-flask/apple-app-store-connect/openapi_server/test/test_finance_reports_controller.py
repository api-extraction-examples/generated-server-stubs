import unittest

from flask import json

from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestFinanceReportsController(BaseTestCase):
    """FinanceReportsController integration test stubs"""

    def test_finance_reports_get_collection(self):
        """Test case for finance_reports_get_collection

        
        """
        query_string = [('filter[regionCode]', ['filter_region_code_example']),
                        ('filter[reportDate]', ['filter_report_date_example']),
                        ('filter[reportType]', ['filter_report_type_example']),
                        ('filter[vendorNumber]', ['filter_vendor_number_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/financeReports',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
