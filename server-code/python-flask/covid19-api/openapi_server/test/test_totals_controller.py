import unittest

from flask import json

from openapi_server.models.get_daily_report_totals200_response_inner import GetDailyReportTotals200ResponseInner  # noqa: E501
from openapi_server.models.get_latest_totals200_response_inner import GetLatestTotals200ResponseInner  # noqa: E501
from openapi_server.test import BaseTestCase


class TestTotalsController(BaseTestCase):
    """TotalsController integration test stubs"""

    def test_get_daily_report_totals(self):
        """Test case for get_daily_report_totals

        getDailyReportTotals
        """
        query_string = [('date', '_date_example'),
                        ('date-format', 'YYYY-MM-DD'),
                        ('format', 'json')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/report/totals',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_latest_totals(self):
        """Test case for get_latest_totals

        getLatestTotals
        """
        query_string = [('format', 'json')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/totals',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
