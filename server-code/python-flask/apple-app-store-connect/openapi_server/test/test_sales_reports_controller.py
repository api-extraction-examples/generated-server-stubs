import unittest

from flask import json

from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestSalesReportsController(BaseTestCase):
    """SalesReportsController integration test stubs"""

    def test_sales_reports_get_collection(self):
        """Test case for sales_reports_get_collection

        
        """
        query_string = [('filter[frequency]', ['filter_frequency_example']),
                        ('filter[reportDate]', ['filter_report_date_example']),
                        ('filter[reportSubType]', ['filter_report_sub_type_example']),
                        ('filter[reportType]', ['filter_report_type_example']),
                        ('filter[vendorNumber]', ['filter_vendor_number_example']),
                        ('filter[version]', ['filter_version_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/salesReports',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
