import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.payments_program_onboarding_response import PaymentsProgramOnboardingResponse  # noqa: E501
from openapi_server import util


def get_payments_program_onboarding(marketplace_id, payments_program_type):  # noqa: E501
    """get_payments_program_onboarding

    &lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is no longer applicable, as all seller accounts globally have been enabled for the new eBay payment and checkout flow.&lt;/span&gt;&lt;br/&gt;&lt;br/&gt;This method retrieves a seller&#39;s onboarding status for a payments program for a specified marketplace. The overall onboarding status of the seller and the status of each onboarding step is returned. # noqa: E501

    :param marketplace_id: The eBay marketplace ID associated with the onboarding status to retrieve.
    :type marketplace_id: str
    :param payments_program_type: The type of payments program whose status is returned by the method.
    :type payments_program_type: str

    :rtype: Union[PaymentsProgramOnboardingResponse, Tuple[PaymentsProgramOnboardingResponse, int], Tuple[PaymentsProgramOnboardingResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
