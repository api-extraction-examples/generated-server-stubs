import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.fulfillment_policy import FulfillmentPolicy  # noqa: E501
from openapi_server.models.fulfillment_policy_request import FulfillmentPolicyRequest  # noqa: E501
from openapi_server.models.fulfillment_policy_response import FulfillmentPolicyResponse  # noqa: E501
from openapi_server.models.set_fulfillment_policy_response import SetFulfillmentPolicyResponse  # noqa: E501
from openapi_server import util


def create_fulfillment_policy(fulfillment_policy_request):  # noqa: E501
    """create_fulfillment_policy

    This method creates a new fulfillment policy where the policy encapsulates seller&#39;s terms for fulfilling item purchases. Fulfillment policies include the shipment options that the seller offers to buyers.  &lt;br/&gt;&lt;br/&gt;Each policy targets a specific eBay marketplace and a category group type, and you can create multiple policies for each combination. &lt;br/&gt;&lt;br/&gt;A successful request returns the &lt;b&gt;getFulfillmentPolicy&lt;/b&gt; URI to the new policy in the &lt;b&gt;Location&lt;/b&gt; response header and the ID for the new policy is returned in the response payload.  &lt;p class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Tip:&lt;/b&gt; For details on creating and using the business policies supported by the Account API, see &lt;a href&#x3D;\&quot;/api-docs/sell/static/seller-accounts/business-policies.html\&quot;&gt;eBay business policies&lt;/a&gt;.&lt;/p&gt;  &lt;p&gt;&lt;b&gt;Using the eBay standard envelope service (eSE)&lt;/b&gt;&lt;/p&gt;  &lt;p&gt;The eBay standard envelope service (eSE) is a domestic envelope service with tracking through eBay. This service applies to specific Trading Cards categories (not all categories are supported), and to Coins &amp; Paper Money, Postcards, and Stamps. See &lt;a href&#x3D;\&quot;/api-docs/sell/static/seller-accounts/using-the-ebay-standard-envelope-service.html\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Using the eBay standard envelope (eSE) service&lt;/a&gt;.&lt;/p&gt; # noqa: E501

    :param fulfillment_policy_request: Request to create a seller account fulfillment policy.
    :type fulfillment_policy_request: dict | bytes

    :rtype: Union[SetFulfillmentPolicyResponse, Tuple[SetFulfillmentPolicyResponse, int], Tuple[SetFulfillmentPolicyResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        fulfillment_policy_request = FulfillmentPolicyRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_fulfillment_policy(fulfillment_policy_id):  # noqa: E501
    """delete_fulfillment_policy

    This method deletes a fulfillment policy. Supply the ID of the policy you want to delete in the &lt;b&gt;fulfillmentPolicyId&lt;/b&gt; path parameter. # noqa: E501

    :param fulfillment_policy_id: This path parameter specifies the ID of the fulfillment policy to delete.
    :type fulfillment_policy_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_fulfillment_policies(marketplace_id):  # noqa: E501
    """get_fulfillment_policies

    This method retrieves all the fulfillment policies configured for the marketplace you specify using the &lt;code&gt;marketplace_id&lt;/code&gt; query parameter.  &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Marketplaces and locales&lt;/b&gt;  &lt;br/&gt;&lt;br/&gt;Get the correct policies for a marketplace that supports multiple locales using the &lt;code&gt;Content-Language&lt;/code&gt; request header. For example, get the policies for the French locale of the Canadian marketplace by specifying &lt;code&gt;fr-CA&lt;/code&gt; for the &lt;code&gt;Content-Language&lt;/code&gt; header. Likewise, target the Dutch locale of the Belgium marketplace by setting &lt;code&gt;Content-Language: nl-BE&lt;/code&gt;. For details on header values, see &lt;a href&#x3D;\&quot;/api-docs/static/rest-request-components.html#HTTP\&quot; target&#x3D;\&quot;_blank\&quot;&gt;HTTP request headers&lt;/a&gt;. # noqa: E501

    :param marketplace_id: This query parameter specifies the eBay marketplace of the policies you want to retrieve. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum
    :type marketplace_id: str

    :rtype: Union[FulfillmentPolicyResponse, Tuple[FulfillmentPolicyResponse, int], Tuple[FulfillmentPolicyResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_fulfillment_policy(fulfillment_policy_id):  # noqa: E501
    """get_fulfillment_policy

    This method retrieves the complete details of a fulfillment policy. Supply the ID of the policy you want to retrieve using the &lt;b&gt;fulfillmentPolicyId&lt;/b&gt; path parameter. # noqa: E501

    :param fulfillment_policy_id: This path parameter specifies the ID of the fulfillment policy you want to retrieve.
    :type fulfillment_policy_id: str

    :rtype: Union[FulfillmentPolicy, Tuple[FulfillmentPolicy, int], Tuple[FulfillmentPolicy, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_fulfillment_policy_by_name(marketplace_id, name):  # noqa: E501
    """get_fulfillment_policy_by_name

    This method retrieves the details for a specific fulfillment policy. In the request, supply both the policy &lt;code&gt;name&lt;/code&gt; and its associated &lt;code&gt;marketplace_id&lt;/code&gt; as query parameters.   &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Marketplaces and locales&lt;/b&gt;  &lt;br/&gt;&lt;br/&gt;Get the correct policy for a marketplace that supports multiple locales using the &lt;code&gt;Content-Language&lt;/code&gt; request header. For example, get a policy for the French locale of the Canadian marketplace by specifying &lt;code&gt;fr-CA&lt;/code&gt; for the &lt;code&gt;Content-Language&lt;/code&gt; header. Likewise, target the Dutch locale of the Belgium marketplace by setting &lt;code&gt;Content-Language: nl-BE&lt;/code&gt;. For details on header values, see &lt;a href&#x3D;\&quot;/api-docs/static/rest-request-components.html#HTTP\&quot;&gt;HTTP request headers&lt;/a&gt;. # noqa: E501

    :param marketplace_id: This query parameter specifies the eBay marketplace of the policy you want to retrieve. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum
    :type marketplace_id: str
    :param name: This query parameter specifies the seller-defined name of the fulfillment policy you want to retrieve.
    :type name: str

    :rtype: Union[FulfillmentPolicy, Tuple[FulfillmentPolicy, int], Tuple[FulfillmentPolicy, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_fulfillment_policy(fulfillment_policy_id, fulfillment_policy_request):  # noqa: E501
    """update_fulfillment_policy

    This method updates an existing fulfillment policy. Specify the policy you want to update using the &lt;b&gt;fulfillment_policy_id&lt;/b&gt; path parameter. Supply a complete policy payload with the updates you want to make; this call overwrites the existing policy with the new details specified in the payload. # noqa: E501

    :param fulfillment_policy_id: This path parameter specifies the ID of the fulfillment policy you want to update.
    :type fulfillment_policy_id: str
    :param fulfillment_policy_request: Fulfillment policy request
    :type fulfillment_policy_request: dict | bytes

    :rtype: Union[SetFulfillmentPolicyResponse, Tuple[SetFulfillmentPolicyResponse, int], Tuple[SetFulfillmentPolicyResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        fulfillment_policy_request = FulfillmentPolicyRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
