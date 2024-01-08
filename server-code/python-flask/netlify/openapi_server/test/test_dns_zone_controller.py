import unittest

from flask import json

from openapi_server.models.dns_record import DnsRecord  # noqa: E501
from openapi_server.models.dns_record_create import DnsRecordCreate  # noqa: E501
from openapi_server.models.dns_zone import DnsZone  # noqa: E501
from openapi_server.models.dns_zone_setup import DnsZoneSetup  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server.test import BaseTestCase


class TestDnsZoneController(BaseTestCase):
    """DnsZoneController integration test stubs"""

    def test_configure_dns_for_site(self):
        """Test case for configure_dns_for_site

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/dns'.format(site_id='site_id_example'),
            method='PUT',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_dns_record(self):
        """Test case for create_dns_record

        
        """
        dns_record = openapi_server.DnsRecordCreate()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/dns_zones/{zone_id}/dns_records'.format(zone_id='zone_id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(dns_record),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_dns_zone(self):
        """Test case for create_dns_zone

        
        """
        dns_zone_params = openapi_server.DnsZoneSetup()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/dns_zones',
            method='POST',
            headers=headers,
            data=json.dumps(dns_zone_params),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_dns_record(self):
        """Test case for delete_dns_record

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/dns_zones/{zone_id}/dns_records/{dns_record_id}'.format(zone_id='zone_id_example', dns_record_id='dns_record_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_dns_zone(self):
        """Test case for delete_dns_zone

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/dns_zones/{zone_id}'.format(zone_id='zone_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_dns_for_site(self):
        """Test case for get_dns_for_site

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/dns'.format(site_id='site_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_dns_records(self):
        """Test case for get_dns_records

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/dns_zones/{zone_id}/dns_records'.format(zone_id='zone_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_dns_zone(self):
        """Test case for get_dns_zone

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/dns_zones/{zone_id}'.format(zone_id='zone_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_dns_zones(self):
        """Test case for get_dns_zones

        
        """
        query_string = [('account_slug', 'account_slug_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/dns_zones',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_individual_dns_record(self):
        """Test case for get_individual_dns_record

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/dns_zones/{zone_id}/dns_records/{dns_record_id}'.format(zone_id='zone_id_example', dns_record_id='dns_record_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_transfer_dns_zone(self):
        """Test case for transfer_dns_zone

        
        """
        query_string = [('account_id', 'account_id_example'),
                        ('transfer_account_id', 'transfer_account_id_example'),
                        ('transfer_user_id', 'transfer_user_id_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/dns_zones/{zone_id}/transfer'.format(zone_id='zone_id_example'),
            method='PUT',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
