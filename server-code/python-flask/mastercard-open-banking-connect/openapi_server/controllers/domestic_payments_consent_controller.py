import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.post_payments_domestic_credit_transfers_consents_ok_body import PostPaymentsDomesticCreditTransfersConsentsOKBody  # noqa: E501
from openapi_server.models.post_payments_domestic_credit_transfers_consents_params_body import PostPaymentsDomesticCreditTransfersConsentsParamsBody  # noqa: E501
from openapi_server import util


def payments_domestic_credit_transfers_consents_post(body):  # noqa: E501
    """Request consent initiation via redirect

    Request Payment Initiation Consent for a domestic credit transfer on behalf of the PSU. # noqa: E501

    :param body: Domestic Payment consent to be wired via Faster Payment System
    :type body: dict | bytes

    :rtype: Union[PostPaymentsDomesticCreditTransfersConsentsOKBody, Tuple[PostPaymentsDomesticCreditTransfersConsentsOKBody, int], Tuple[PostPaymentsDomesticCreditTransfersConsentsOKBody, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        body = PostPaymentsDomesticCreditTransfersConsentsParamsBody.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
