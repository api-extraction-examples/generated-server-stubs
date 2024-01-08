import unittest

from flask import json

from openapi_server.models.get_daily_report_all_countries200_response_inner import GetDailyReportAllCountries200ResponseInner  # noqa: E501
from openapi_server.models.get_latest_country_data_by_name200_response_inner import GetLatestCountryDataByName200ResponseInner  # noqa: E501
from openapi_server.test import BaseTestCase


class TestCountryController(BaseTestCase):
    """CountryController integration test stubs"""

    def test_get_daily_report_all_countries(self):
        """Test case for get_daily_report_all_countries

        getDailyReportAllCountries
        """
        query_string = [('date', '_date_example'),
                        ('date-format', 'YYYY-MM-DD'),
                        ('format', 'json')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/report/country/all',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_daily_report_by_country_code(self):
        """Test case for get_daily_report_by_country_code

        getDailyReportByCountryCode
        """
        query_string = [('code', 'code_example'),
                        ('date', '_date_example'),
                        ('date-format', 'YYYY-MM-DD'),
                        ('format', 'json')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/report/country/code',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_daily_report_by_country_name(self):
        """Test case for get_daily_report_by_country_name

        getDailyReportByCountryName
        """
        query_string = [('name', 'name_example'),
                        ('date', '_date_example'),
                        ('date-format', 'YYYY-MM-DD'),
                        ('format', 'json')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/report/country/name',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_latest_all_countries(self):
        """Test case for get_latest_all_countries

        getLatestAllCountries
        """
        query_string = [('format', 'json')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/country/all',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_latest_country_data_by_code(self):
        """Test case for get_latest_country_data_by_code

        getLatestCountryDataByCode
        """
        query_string = [('code', 'code_example'),
                        ('format', 'json')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/country/code',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_latest_country_data_by_name(self):
        """Test case for get_latest_country_data_by_name

        getLatestCountryDataByName
        """
        query_string = [('name', 'name_example'),
                        ('format', 'json')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/country',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
