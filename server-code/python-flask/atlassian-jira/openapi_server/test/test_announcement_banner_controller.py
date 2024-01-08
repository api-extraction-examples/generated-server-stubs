import unittest

from flask import json

from openapi_server.models.announcement_banner_configuration import AnnouncementBannerConfiguration  # noqa: E501
from openapi_server.models.announcement_banner_configuration_update import AnnouncementBannerConfigurationUpdate  # noqa: E501
from openapi_server.models.error_collection import ErrorCollection  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAnnouncementBannerController(BaseTestCase):
    """AnnouncementBannerController integration test stubs"""

    def test_get_banner(self):
        """Test case for get_banner

        Get announcement banner configuration
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/announcementBanner',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_set_banner(self):
        """Test case for set_banner

        Update announcement banner configuration
        """
        announcement_banner_configuration_update = {"visibility":"visibility","isEnabled":True,"isDismissible":True,"message":"message"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/announcementBanner',
            method='PUT',
            headers=headers,
            data=json.dumps(announcement_banner_configuration_update),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
