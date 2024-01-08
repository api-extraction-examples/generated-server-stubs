import unittest

from flask import json

from openapi_server.models.fulfillment_policy import FulfillmentPolicy  # noqa: E501
from openapi_server.models.fulfillment_policy_request import FulfillmentPolicyRequest  # noqa: E501
from openapi_server.models.fulfillment_policy_response import FulfillmentPolicyResponse  # noqa: E501
from openapi_server.models.set_fulfillment_policy_response import SetFulfillmentPolicyResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestFulfillmentPolicyController(BaseTestCase):
    """FulfillmentPolicyController integration test stubs"""

    def test_create_fulfillment_policy(self):
        """Test case for create_fulfillment_policy

        
        """
        fulfillment_policy_request = {"handlingTime":{"unit":"unit","value":0},"localPickup":True,"marketplaceId":"marketplaceId","categoryTypes":[{"default":True,"name":"name"},{"default":True,"name":"name"}],"name":"name","description":"description","pickupDropOff":True,"globalShipping":True,"freightShipping":True,"shipToLocations":{"regionIncluded":[{"regionType":"regionType","regionName":"regionName"},{"regionType":"regionType","regionName":"regionName"}],"regionExcluded":[{"regionType":"regionType","regionName":"regionName"},{"regionType":"regionType","regionName":"regionName"}]},"shippingOptions":[{"optionType":"optionType","insuranceFee":{"currency":"currency","value":"value"},"rateTableId":"rateTableId","shippingPromotionOffered":True,"costType":"costType","insuranceOffered":True,"packageHandlingCost":{"currency":"currency","value":"value"},"shippingDiscountProfileId":"shippingDiscountProfileId","shippingServices":[{"surcharge":{"currency":"currency","value":"value"},"buyerResponsibleForPickup":True,"buyerResponsibleForShipping":True,"shippingCost":{"currency":"currency","value":"value"},"additionalShippingCost":{"currency":"currency","value":"value"},"freeShipping":True,"shippingCarrierCode":"shippingCarrierCode","sortOrder":6,"shippingServiceCode":"shippingServiceCode","shipToLocations":{"regionIncluded":[{"regionType":"regionType","regionName":"regionName"},{"regionType":"regionType","regionName":"regionName"}],"regionExcluded":[{"regionType":"regionType","regionName":"regionName"},{"regionType":"regionType","regionName":"regionName"}]},"cashOnDeliveryFee":{"currency":"currency","value":"value"}},{"surcharge":{"currency":"currency","value":"value"},"buyerResponsibleForPickup":True,"buyerResponsibleForShipping":True,"shippingCost":{"currency":"currency","value":"value"},"additionalShippingCost":{"currency":"currency","value":"value"},"freeShipping":True,"shippingCarrierCode":"shippingCarrierCode","sortOrder":6,"shippingServiceCode":"shippingServiceCode","shipToLocations":{"regionIncluded":[{"regionType":"regionType","regionName":"regionName"},{"regionType":"regionType","regionName":"regionName"}],"regionExcluded":[{"regionType":"regionType","regionName":"regionName"},{"regionType":"regionType","regionName":"regionName"}]},"cashOnDeliveryFee":{"currency":"currency","value":"value"}}]},{"optionType":"optionType","insuranceFee":{"currency":"currency","value":"value"},"rateTableId":"rateTableId","shippingPromotionOffered":True,"costType":"costType","insuranceOffered":True,"packageHandlingCost":{"currency":"currency","value":"value"},"shippingDiscountProfileId":"shippingDiscountProfileId","shippingServices":[{"surcharge":{"currency":"currency","value":"value"},"buyerResponsibleForPickup":True,"buyerResponsibleForShipping":True,"shippingCost":{"currency":"currency","value":"value"},"additionalShippingCost":{"currency":"currency","value":"value"},"freeShipping":True,"shippingCarrierCode":"shippingCarrierCode","sortOrder":6,"shippingServiceCode":"shippingServiceCode","shipToLocations":{"regionIncluded":[{"regionType":"regionType","regionName":"regionName"},{"regionType":"regionType","regionName":"regionName"}],"regionExcluded":[{"regionType":"regionType","regionName":"regionName"},{"regionType":"regionType","regionName":"regionName"}]},"cashOnDeliveryFee":{"currency":"currency","value":"value"}},{"surcharge":{"currency":"currency","value":"value"},"buyerResponsibleForPickup":True,"buyerResponsibleForShipping":True,"shippingCost":{"currency":"currency","value":"value"},"additionalShippingCost":{"currency":"currency","value":"value"},"freeShipping":True,"shippingCarrierCode":"shippingCarrierCode","sortOrder":6,"shippingServiceCode":"shippingServiceCode","shipToLocations":{"regionIncluded":[{"regionType":"regionType","regionName":"regionName"},{"regionType":"regionType","regionName":"regionName"}],"regionExcluded":[{"regionType":"regionType","regionName":"regionName"},{"regionType":"regionType","regionName":"regionName"}]},"cashOnDeliveryFee":{"currency":"currency","value":"value"}}]}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/sell/account/v1/fulfillment_policy/',
            method='POST',
            headers=headers,
            data=json.dumps(fulfillment_policy_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_fulfillment_policy(self):
        """Test case for delete_fulfillment_policy

        
        """
        headers = { 
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/sell/account/v1/fulfillment_policy/{fulfillment_policy_id}'.format(fulfillment_policy_id='fulfillment_policy_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_fulfillment_policies(self):
        """Test case for get_fulfillment_policies

        
        """
        query_string = [('marketplace_id', 'marketplace_id_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/sell/account/v1/fulfillment_policy',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_fulfillment_policy(self):
        """Test case for get_fulfillment_policy

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/sell/account/v1/fulfillment_policy/{fulfillment_policy_id}'.format(fulfillment_policy_id='fulfillment_policy_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_fulfillment_policy_by_name(self):
        """Test case for get_fulfillment_policy_by_name

        
        """
        query_string = [('marketplace_id', 'marketplace_id_example'),
                        ('name', 'name_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/sell/account/v1/fulfillment_policy/get_by_policy_name',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_fulfillment_policy(self):
        """Test case for update_fulfillment_policy

        
        """
        fulfillment_policy_request = {"handlingTime":{"unit":"unit","value":0},"localPickup":True,"marketplaceId":"marketplaceId","categoryTypes":[{"default":True,"name":"name"},{"default":True,"name":"name"}],"name":"name","description":"description","pickupDropOff":True,"globalShipping":True,"freightShipping":True,"shipToLocations":{"regionIncluded":[{"regionType":"regionType","regionName":"regionName"},{"regionType":"regionType","regionName":"regionName"}],"regionExcluded":[{"regionType":"regionType","regionName":"regionName"},{"regionType":"regionType","regionName":"regionName"}]},"shippingOptions":[{"optionType":"optionType","insuranceFee":{"currency":"currency","value":"value"},"rateTableId":"rateTableId","shippingPromotionOffered":True,"costType":"costType","insuranceOffered":True,"packageHandlingCost":{"currency":"currency","value":"value"},"shippingDiscountProfileId":"shippingDiscountProfileId","shippingServices":[{"surcharge":{"currency":"currency","value":"value"},"buyerResponsibleForPickup":True,"buyerResponsibleForShipping":True,"shippingCost":{"currency":"currency","value":"value"},"additionalShippingCost":{"currency":"currency","value":"value"},"freeShipping":True,"shippingCarrierCode":"shippingCarrierCode","sortOrder":6,"shippingServiceCode":"shippingServiceCode","shipToLocations":{"regionIncluded":[{"regionType":"regionType","regionName":"regionName"},{"regionType":"regionType","regionName":"regionName"}],"regionExcluded":[{"regionType":"regionType","regionName":"regionName"},{"regionType":"regionType","regionName":"regionName"}]},"cashOnDeliveryFee":{"currency":"currency","value":"value"}},{"surcharge":{"currency":"currency","value":"value"},"buyerResponsibleForPickup":True,"buyerResponsibleForShipping":True,"shippingCost":{"currency":"currency","value":"value"},"additionalShippingCost":{"currency":"currency","value":"value"},"freeShipping":True,"shippingCarrierCode":"shippingCarrierCode","sortOrder":6,"shippingServiceCode":"shippingServiceCode","shipToLocations":{"regionIncluded":[{"regionType":"regionType","regionName":"regionName"},{"regionType":"regionType","regionName":"regionName"}],"regionExcluded":[{"regionType":"regionType","regionName":"regionName"},{"regionType":"regionType","regionName":"regionName"}]},"cashOnDeliveryFee":{"currency":"currency","value":"value"}}]},{"optionType":"optionType","insuranceFee":{"currency":"currency","value":"value"},"rateTableId":"rateTableId","shippingPromotionOffered":True,"costType":"costType","insuranceOffered":True,"packageHandlingCost":{"currency":"currency","value":"value"},"shippingDiscountProfileId":"shippingDiscountProfileId","shippingServices":[{"surcharge":{"currency":"currency","value":"value"},"buyerResponsibleForPickup":True,"buyerResponsibleForShipping":True,"shippingCost":{"currency":"currency","value":"value"},"additionalShippingCost":{"currency":"currency","value":"value"},"freeShipping":True,"shippingCarrierCode":"shippingCarrierCode","sortOrder":6,"shippingServiceCode":"shippingServiceCode","shipToLocations":{"regionIncluded":[{"regionType":"regionType","regionName":"regionName"},{"regionType":"regionType","regionName":"regionName"}],"regionExcluded":[{"regionType":"regionType","regionName":"regionName"},{"regionType":"regionType","regionName":"regionName"}]},"cashOnDeliveryFee":{"currency":"currency","value":"value"}},{"surcharge":{"currency":"currency","value":"value"},"buyerResponsibleForPickup":True,"buyerResponsibleForShipping":True,"shippingCost":{"currency":"currency","value":"value"},"additionalShippingCost":{"currency":"currency","value":"value"},"freeShipping":True,"shippingCarrierCode":"shippingCarrierCode","sortOrder":6,"shippingServiceCode":"shippingServiceCode","shipToLocations":{"regionIncluded":[{"regionType":"regionType","regionName":"regionName"},{"regionType":"regionType","regionName":"regionName"}],"regionExcluded":[{"regionType":"regionType","regionName":"regionName"},{"regionType":"regionType","regionName":"regionName"}]},"cashOnDeliveryFee":{"currency":"currency","value":"value"}}]}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/sell/account/v1/fulfillment_policy/{fulfillment_policy_id}'.format(fulfillment_policy_id='fulfillment_policy_id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(fulfillment_policy_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
