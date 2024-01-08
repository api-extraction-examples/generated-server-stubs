import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.payment_policy import PaymentPolicy  # noqa: E501
from openapi_server.models.payment_policy_request import PaymentPolicyRequest  # noqa: E501
from openapi_server.models.payment_policy_response import PaymentPolicyResponse  # noqa: E501
from openapi_server.models.set_payment_policy_response import SetPaymentPolicyResponse  # noqa: E501
from openapi_server import util


def create_payment_policy(payment_policy_request):  # noqa: E501
    """create_payment_policy

    This method creates a new payment policy where the policy encapsulates seller&#39;s terms for order payments.  &lt;br/&gt;&lt;br/&gt;Each policy targets a specific eBay marketplace and category group, and you can create multiple policies for each combination.  &lt;br/&gt;&lt;br/&gt;A successful request returns the &lt;b&gt;getPaymentPolicy&lt;/b&gt; URI to the new policy in the &lt;b&gt;Location&lt;/b&gt; response header and the ID for the new policy is returned in the response payload.  &lt;p class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Tip:&lt;/b&gt; For details on creating and using the business policies supported by the Account API, see &lt;a href&#x3D;\&quot;/api-docs/sell/static/seller-accounts/business-policies.html\&quot;&gt;eBay business policies&lt;/a&gt;.&lt;/p&gt; # noqa: E501

    :param payment_policy_request: Payment policy request
    :type payment_policy_request: dict | bytes

    :rtype: Union[SetPaymentPolicyResponse, Tuple[SetPaymentPolicyResponse, int], Tuple[SetPaymentPolicyResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        payment_policy_request = PaymentPolicyRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_payment_policy(payment_policy_id):  # noqa: E501
    """delete_payment_policy

    This method deletes a payment policy. Supply the ID of the policy you want to delete in the &lt;b&gt;paymentPolicyId&lt;/b&gt; path parameter.  # noqa: E501

    :param payment_policy_id: This path parameter specifies the ID of the payment policy you want to delete.
    :type payment_policy_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_payment_policies(marketplace_id):  # noqa: E501
    """get_payment_policies

    This method retrieves all the payment policies configured for the marketplace you specify using the &lt;code&gt;marketplace_id&lt;/code&gt; query parameter.  &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Marketplaces and locales&lt;/b&gt;  &lt;br/&gt;&lt;br/&gt;Get the correct policies for a marketplace that supports multiple locales using the &lt;code&gt;Content-Language&lt;/code&gt; request header. For example, get the policies for the French locale of the Canadian marketplace by specifying &lt;code&gt;fr-CA&lt;/code&gt; for the &lt;code&gt;Content-Language&lt;/code&gt; header. Likewise, target the Dutch locale of the Belgium marketplace by setting &lt;code&gt;Content-Language: nl-BE&lt;/code&gt;. For details on header values, see &lt;a href&#x3D;\&quot;/api-docs/static/rest-request-components.html#HTTP\&quot; target&#x3D;\&quot;_blank\&quot;&gt;HTTP request headers&lt;/a&gt;. # noqa: E501

    :param marketplace_id: This query parameter specifies the eBay marketplace of the policies you want to retrieve. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum
    :type marketplace_id: str

    :rtype: Union[PaymentPolicyResponse, Tuple[PaymentPolicyResponse, int], Tuple[PaymentPolicyResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_payment_policy(payment_policy_id):  # noqa: E501
    """get_payment_policy

    This method retrieves the complete details of a payment policy. Supply the ID of the policy you want to retrieve using the &lt;b&gt;paymentPolicyId&lt;/b&gt; path parameter. # noqa: E501

    :param payment_policy_id: This path parameter specifies the ID of the payment policy you want to retrieve.
    :type payment_policy_id: str

    :rtype: Union[PaymentPolicy, Tuple[PaymentPolicy, int], Tuple[PaymentPolicy, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_payment_policy_by_name(marketplace_id, name):  # noqa: E501
    """get_payment_policy_by_name

    This method retrieves the details of a specific payment policy. Supply both the policy &lt;code&gt;name&lt;/code&gt; and its associated &lt;code&gt;marketplace_id&lt;/code&gt; in the request query parameters.   &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Marketplaces and locales&lt;/b&gt;  &lt;br/&gt;&lt;br/&gt;Get the correct policy for a marketplace that supports multiple locales using the &lt;code&gt;Content-Language&lt;/code&gt; request header. For example, get a policy for the French locale of the Canadian marketplace by specifying &lt;code&gt;fr-CA&lt;/code&gt; for the &lt;code&gt;Content-Language&lt;/code&gt; header. Likewise, target the Dutch locale of the Belgium marketplace by setting &lt;code&gt;Content-Language: nl-BE&lt;/code&gt;. For details on header values, see &lt;a href&#x3D;\&quot;/api-docs/static/rest-request-components.html#HTTP\&quot;&gt;HTTP request headers&lt;/a&gt;. # noqa: E501

    :param marketplace_id: This query parameter specifies the eBay marketplace of the policy you want to retrieve. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum
    :type marketplace_id: str
    :param name: This query parameter specifies the seller-defined name of the payment policy you want to retrieve.
    :type name: str

    :rtype: Union[PaymentPolicy, Tuple[PaymentPolicy, int], Tuple[PaymentPolicy, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_payment_policy(payment_policy_id, payment_policy_request):  # noqa: E501
    """update_payment_policy

    This method updates an existing payment policy. Specify the policy you want to update using the &lt;b&gt;payment_policy_id&lt;/b&gt; path parameter. Supply a complete policy payload with the updates you want to make; this call overwrites the existing policy with the new details specified in the payload. # noqa: E501

    :param payment_policy_id: This path parameter specifies the ID of the payment policy you want to update.
    :type payment_policy_id: str
    :param payment_policy_request: Payment policy request
    :type payment_policy_request: dict | bytes

    :rtype: Union[SetPaymentPolicyResponse, Tuple[SetPaymentPolicyResponse, int], Tuple[SetPaymentPolicyResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        payment_policy_request = PaymentPolicyRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
