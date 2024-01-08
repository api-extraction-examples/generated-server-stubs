import unittest

from flask import json

from openapi_server.models.country_info import CountryInfo  # noqa: E501
from openapi_server.models.culture_dto import CultureDto  # noqa: E501
from openapi_server.models.localization_option import LocalizationOption  # noqa: E501
from openapi_server.models.parental_rating import ParentalRating  # noqa: E501
from openapi_server.test import BaseTestCase


class TestLocalizationController(BaseTestCase):
    """LocalizationController integration test stubs"""

    def test_get_countries(self):
        """Test case for get_countries

        Gets known countries.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Localization/Countries',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_cultures(self):
        """Test case for get_cultures

        Gets known cultures.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Localization/Cultures',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_localization_options(self):
        """Test case for get_localization_options

        Gets localization options.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Localization/Options',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_parental_ratings(self):
        """Test case for get_parental_ratings

        Gets known parental ratings.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Localization/ParentalRatings',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
